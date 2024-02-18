package com.christa.mortgagecalculator.exceptions;

public class ExternalDataSourceException extends RuntimeException {
    public ExternalDataSourceException(String message) {
        super(message);
    }

    public ExternalDataSourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
