package com.christa.mortgagecalculator.services;

import com.christa.mortgagecalculator.dto.request.LoanCalculationRequest;
import com.christa.mortgagecalculator.dto.response.LoanCalculationResponse;
import org.springframework.stereotype.Service;

@Service
public class MortgageCalculatorServiceImpl implements MortgageCalculatorService {

    @Override
    public LoanCalculationResponse calculateMortgage(LoanCalculationRequest request) {
        double monthlyPayment = this.calculateMonthlyPayment(
                request.getLoanAmount(), request.getInterestRate(), request.getLoanDurationYears());

        LoanCalculationResponse response = new LoanCalculationResponse();
        response.setMonthlyPayment(monthlyPayment);

        return response;
    }

    @Override
    public double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanDurationYears) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int loanDurationMonths = loanDurationYears * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanDurationMonths));

        return monthlyPayment;
    }
}
