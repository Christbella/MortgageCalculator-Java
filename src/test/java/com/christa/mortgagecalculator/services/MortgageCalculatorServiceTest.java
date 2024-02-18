package com.christa.mortgagecalculator.services;

import com.christa.mortgagecalculator.dto.request.LoanCalculationRequest;
import com.christa.mortgagecalculator.dto.response.LoanCalculationResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MortgageCalculatorServiceTest {

    @Autowired
    private MortgageCalculatorServiceImpl mortgageCalculatorService;

    @Test
    void calculateMonthlyPayment() {
        double loanAmount = 100000;
        double annualInterestRate = 5.0;
        int loanDurationYears = 20;

        double expectedMonthlyPayment = 659.96;

        double monthlyPayment = mortgageCalculatorService.calculateMonthlyPayment(loanAmount, annualInterestRate, loanDurationYears);

        Assertions.assertEquals(expectedMonthlyPayment, monthlyPayment, 0.01);
    }

    @Test
    void calculateMortgage() {
        LoanCalculationRequest request = new LoanCalculationRequest(100000, 5.0, 20);
        LoanCalculationResponse response = mortgageCalculatorService.calculateMortgage(request);

        double expectedMonthlyPayment = 659.96;

        Assertions.assertEquals(expectedMonthlyPayment, response.getMonthlyPayment(), 0.01);
    }
}
