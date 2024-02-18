package com.christa.mortgagecalculator.exceptions;

public class InvalidLoanDetailsException extends RuntimeException {
    public InvalidLoanDetailsException(String message) {
        super(message);
    }

    public InvalidLoanDetailsException(String message, Throwable cause) {
        super(message, cause);
    }
}
