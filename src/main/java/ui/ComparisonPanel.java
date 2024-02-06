package ui;

import javax.swing.*;

public class ComparisonPanel extends JPanel {
    private JLabel comparisonResult;

    public ComparisonPanel() {
        comparisonResult = new JLabel("Comparison results will be shown here.");
        add(comparisonResult);
    }

    // Method to update comparison results
    public void setComparisonResult(String resultText) {
        comparisonResult.setText(resultText);
    }
}

