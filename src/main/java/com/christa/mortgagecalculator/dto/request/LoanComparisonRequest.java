package com.christa.mortgagecalculator.dto.request;

import java.util.List;

public class LoanComparisonRequest {
    private List<LoanDetail> loanDetails;

    public static class LoanDetail {
        private double loanAmount;
        private double interestRate;
        private int loanDurationYears;

        // Constructors, getters, and setters
        public LoanDetail() {}

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
    }

    // Getter and setter for loanDetails
    public List<LoanDetail> getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(List<LoanDetail> loanDetails) {
        this.loanDetails = loanDetails;
    }
}
