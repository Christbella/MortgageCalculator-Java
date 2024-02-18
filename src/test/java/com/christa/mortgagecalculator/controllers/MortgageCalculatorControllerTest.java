package com.christa.mortgagecalculator.controllers;

import com.christa.mortgagecalculator.dto.request.LoanCalculationRequest;
import com.christa.mortgagecalculator.dto.response.LoanCalculationResponse;
import com.christa.mortgagecalculator.services.MortgageCalculatorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MortgageCalculatorController.class)
public class MortgageCalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MortgageCalculatorService mortgageCalculatorService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        LoanCalculationResponse mockResponse = new LoanCalculationResponse();
        mockResponse.setMonthlyPayment(5000);
        mockResponse.setTotalPayment(1800000);
        mockResponse.setTotalInterest(300000);

        Mockito.when(mortgageCalculatorService.calculateMortgage(any(LoanCalculationRequest.class)))
                .thenReturn(mockResponse);
    }

    @Test
    public void testCalculateMortgage() throws Exception {
        LoanCalculationRequest request = new LoanCalculationRequest();
        request.setLoanAmount(150000);
        request.setInterestRate(5);
        request.setLoanDurationYears(30);

        mockMvc.perform(post("/calculateMortgage")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.monthlyPayment").value(5000))
                .andExpect(jsonPath("$.totalPayment").value(1800000))
                .andExpect(jsonPath("$.totalInterest").value(300000));
    }
}
