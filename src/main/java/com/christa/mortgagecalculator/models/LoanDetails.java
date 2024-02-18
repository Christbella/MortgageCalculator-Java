package com.christa.mortgagecalculator.models;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanDetails {
    private double loanAmount;
    private double interestRate;
    private int loanDurationYears;
}
