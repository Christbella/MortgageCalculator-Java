package com.christa.mortgagecalculator.enums;

public enum LoanType {
    FIXED_RATE("Fixed Rate"),
    ADJUSTABLE_RATE("Adjustable Rate");

    private final String displayName;

    LoanType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
