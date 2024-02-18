package com.christa.mortgagecalculator.dto.response;

import java.util.List;

public class LoanComparisonResponse {
    private List<ComparisonResult> comparisonResults;

    public static class ComparisonResult {
        private double loanAmount;
        private double interestRate;
        private int loanDurationYears;
        private double monthlyPayment;

        // Constructors, getters, and setters
        public ComparisonResult() {}

        public double getLoanAmount() {
            return loanAmount;
        }

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public int getLoanDurationYears() {
            return loanDurationYears;
        }

        public void setLoanDurationYears(int loanDurationYears) {
            this.loanDurationYears = loanDurationYears;
        }

        public double getMonthlyPayment() {
            return monthlyPayment;
        }

        public void setMonthlyPayment(double monthlyPayment) {
            this.monthlyPayment = monthlyPayment;
        }
    }

    // Getter and setter for comparisonResults
    public List<ComparisonResult> getComparisonResults() {
        return comparisonResults;
    }

    public void setComparisonResults(List<ComparisonResult> comparisonResults) {
        this.comparisonResults = comparisonResults;
    }
}
