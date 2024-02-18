package com.christa.mortgagecalculator.controllers;

import com.christa.mortgagecalculator.dto.request.LoanCalculationRequest;
import com.christa.mortgagecalculator.dto.response.LoanCalculationResponse;
import com.christa.mortgagecalculator.services.MortgageCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MortgageCalculatorController {

    private final MortgageCalculatorService mortgageCalculatorService;

    @Autowired
    public MortgageCalculatorController(MortgageCalculatorService mortgageCalculatorService) {
        this.mortgageCalculatorService = mortgageCalculatorService;
    }

    @PostMapping("/calculateMortgage")
    public ResponseEntity<LoanCalculationResponse> calculateMortgage(@Validated @RequestBody LoanCalculationRequest request) {
        LoanCalculationResponse response = mortgageCalculatorService.calculateMortgage(request);
        return ResponseEntity.ok(response);
    }
}
