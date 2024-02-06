package ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private InputPanel inputPanel;
    private ResultsPanel resultsPanel;
    private ComparisonPanel comparisonPanel;

    public MainWindow() {
        setTitle("Mortgage Calculator");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        inputPanel = new InputPanel();
        resultsPanel = new ResultsPanel();
        comparisonPanel = new ComparisonPanel();

        add(inputPanel, BorderLayout.NORTH);
        add(resultsPanel, BorderLayout.CENTER);
        add(comparisonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}
