package controller;

import model.LoanDetails;
import model.MortgagePayment;
import ui.InputPanel;
import ui.ResultsPanel;
import util.MortgageCalculatorUtil;

import javax.swing.*;

public class MortgageCalculatorController {
    private InputPanel inputPanel;
    private ResultsPanel resultsPanel;

    public MortgageCalculatorController(InputPanel inputPanel, ResultsPanel resultsPanel) {
        this.inputPanel = inputPanel;
        this.resultsPanel = resultsPanel;
        initController();
    }

    private void initController() {
        inputPanel.getCalculateButton().addActionListener(e -> calculateMortgage());
    }

    private void calculateMortgage() {
        try {
            // Extract input values from inputPanel
            double loanAmount = Double.parseDouble(inputPanel.getLoanAmountField().getText());
            double interestRate = Double.parseDouble(inputPanel.getInterestRateField().getText());
            int loanDuration = Integer.parseInt(inputPanel.getLoanDurationField().getText());

            LoanDetails loanDetails = new LoanDetails(loanAmount, interestRate, loanDuration);
            double monthlyPayment = MortgageCalculatorUtil.calculateMonthlyPayment(loanDetails);

            // Assuming totalPayment and totalInterest calculations are implemented
            double totalPayment = monthlyPayment * loanDuration * 12;
            double totalInterest = totalPayment - loanAmount;

            MortgagePayment paymentDetails = new MortgagePayment(monthlyPayment, totalPayment, totalInterest);
            resultsPanel.setMonthlyPayment(String.format("%.2f", paymentDetails.getMonthlyPayment()));

            // Update resultsPanel with more details as needed
        } catch (NumberFormatException ex) {
            // Handle invalid input format
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for loan details.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Handle other exceptions
            JOptionPane.showMessageDialog(null, "Error calculating mortgage: " + ex.getMessage(), "Calculation Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
