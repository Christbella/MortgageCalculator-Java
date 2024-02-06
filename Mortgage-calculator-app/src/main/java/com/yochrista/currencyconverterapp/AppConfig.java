package com.yochrista.currencyconverterapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.yochrista.currencyconverter.CurrencyConverter;
import com.yochrista.currencyconverter.ExchangeRateService;
import com.yochrista.currencyconverter.MortgageCalculator;

@Configuration
public class AppConfig {

    @Bean
    public ExchangeRateService exchangeRateService() {
        return new ExchangeRateService();
    }
    @Bean
    public CurrencyConverter currencyConverter() {
        ExchangeRateService service = new ExchangeRateService(); 
        return new CurrencyConverter(service);
    }
     @Bean
    public MortgageCalculator mortgageCalculator(CurrencyConverter currencyConverter) {
        return new MortgageCalculator(currencyConverter);
    }
}
