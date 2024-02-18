package com.christa.mortgagecalculator.dto.response;

public class LoanCalculationResponse {
    private double monthlyPayment;
    private double totalPayment;
    private double totalInterest;

    // Default constructor
    public LoanCalculationResponse() {}

    // Getter and Setter for monthlyPayment
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    // Getter and Setter for totalPayment
    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    // Getter and Setter for totalInterest
    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }
}
