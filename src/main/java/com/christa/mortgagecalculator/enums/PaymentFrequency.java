package com.christa.mortgagecalculator.enums;

public enum PaymentFrequency {
    MONTHLY("Monthly"),
    BIWEEKLY("Biweekly"),
    WEEKLY("Weekly");

    private final String displayName;

    PaymentFrequency(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
