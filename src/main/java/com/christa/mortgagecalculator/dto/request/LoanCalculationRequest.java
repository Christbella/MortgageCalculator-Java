package com.christa.mortgagecalculator.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoanCalculationRequest {
    private double loanAmount;
    private double interestRate;
    private int loanDurationYears;
}
