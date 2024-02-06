package model;

public class LoanDetails {
    private double loanAmount;
    private double interestRate;
    private int loanDuration;

    public LoanDetails(double loanAmount, double interestRate, int loanDuration) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanDuration = loanDuration;
    }

    public double getInterestRate() {
        return 0;
    }

    public double getLoanAmount() {
        return 0;
    }

    public int getLoanDuration() {
        return 0;
    }

    // Getters and setters
}
