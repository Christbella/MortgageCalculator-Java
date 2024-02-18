package com.christa.mortgagecalculator.util;

public class MortgageCalculationUtil {
    public static double calculateMonthlyPayment(double principal, double annualInterestRate, int termInYears) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        long termInMonths = termInYears * 12;
        double monthlyPayment = (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -termInMonths));
        return monthlyPayment;
    }

}
