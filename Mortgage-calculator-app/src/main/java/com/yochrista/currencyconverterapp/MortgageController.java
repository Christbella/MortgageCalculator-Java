package com.yochrista.currencyconverterapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yochrista.currencyconverter.MortgageCalculator;

@RestController
public class MortgageController {

    @Autowired
    private MortgageCalculator mortgageCalculator; 

    @GetMapping("/mortgagecalculator")
    public String calculateMortgage(@RequestParam String base, @RequestParam String target, @RequestParam double principal, @RequestParam double air, @RequestParam int tiy) {
        double convertedAmount = mortgageCalculator.calculateMonthlyPaymentInLocalCurrency(principal, air, tiy, base, target);
        return "Monthly Mortgage Payment in " + target + ": " + convertedAmount;
    }
}
