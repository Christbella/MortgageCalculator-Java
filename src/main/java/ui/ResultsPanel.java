package ui;

import javax.swing.*;

public class ResultsPanel extends JPanel {
    private JLabel monthlyPaymentResult;

    public ResultsPanel() {
        monthlyPaymentResult = new JLabel("Monthly Payment: ");
        add(monthlyPaymentResult);
    }

    public void setMonthlyPayment(String payment) {
        monthlyPaymentResult.setText("Monthly Payment: " + payment);
    }
}

