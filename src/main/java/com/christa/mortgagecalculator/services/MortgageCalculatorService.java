package com.christa.mortgagecalculator.services;

import com.christa.mortgagecalculator.dto.request.LoanCalculationRequest;
import com.christa.mortgagecalculator.dto.response.LoanCalculationResponse;

public interface MortgageCalculatorService {
    LoanCalculationResponse calculateMortgage(LoanCalculationRequest request);

    double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanDurationYears);
}
