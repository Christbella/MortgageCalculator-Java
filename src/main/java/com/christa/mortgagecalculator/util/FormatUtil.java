package com.christa.mortgagecalculator.util;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatUtil {
    public static String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(amount);
    }
    // Method to format currency for a specific locale, if your application needs to support internationalization
    public static String formatCurrencyForLocale(double amount, Locale locale) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(amount);
    }

}
