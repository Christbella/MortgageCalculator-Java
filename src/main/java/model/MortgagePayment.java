package model;

public class MortgagePayment {
    private double monthlyPayment;
    private double totalPayment;
    private double totalInterest;

    public MortgagePayment(double monthlyPayment, double totalPayment, double totalInterest) {
        this.monthlyPayment = monthlyPayment;
        this.totalPayment = totalPayment;
        this.totalInterest = totalInterest;
    }

    // Getters
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getTotalInterest() {
        return totalInterest;
    }
}


