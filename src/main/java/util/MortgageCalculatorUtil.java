package util;

import model.LoanDetails;

public class MortgageCalculatorUtil {
    public static double calculateMonthlyPayment(LoanDetails details) {
        double monthlyInterestRate = details.getInterestRate() / 100 / 12;
        double loanAmount = details.getLoanAmount();
        int termInMonths = details.getLoanDuration() * 12;

        double monthlyPayment =
                (loanAmount * monthlyInterestRate) /
                        (1 - Math.pow(1 + monthlyInterestRate, -termInMonths));
        return monthlyPayment;
    }
}
