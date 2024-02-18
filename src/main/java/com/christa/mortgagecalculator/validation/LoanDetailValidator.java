package com.christa.mortgagecalculator.validation;

import com.christa.mortgagecalculator.exceptions.InvalidLoanDetailsException;
import com.christa.mortgagecalculator.models.LoanDetails;

public class LoanDetailValidator {

    public static void validateLoanDetails(LoanDetails loanDetails) throws InvalidLoanDetailsException {
        if (!validateLoanAmount(loanDetails.getLoanAmount()) ||
                !validateInterestRate(loanDetails.getInterestRate()) ||
                !validateLoanDurationYears(loanDetails.getLoanDurationYears())) {
            throw new InvalidLoanDetailsException("Loan details validation failed.");
        }
        // Add any additional complex validations as needed
    }

    private static boolean validateLoanAmount(double loanAmount) {
        return loanAmount > 0;
    }

    private static boolean validateInterestRate(double interestRate) {
        return interestRate > 0 && interestRate <= 20;
    }

    private static boolean validateLoanDurationYears(int loanDurationYears) {
        return loanDurationYears >= 1 && loanDurationYears <= 40;
    }

    // Additional validation methods for more complex rules can be added here
}
