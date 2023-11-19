package ru.mirea.ikbo2822.ulyanov.lab20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private final CalculatorModel model;
    protected CalculatorView view;

    CalculatorController(CalculatorModel model,CalculatorView view) {
        this.model = model;
        this.view = view;

        for (JButton digitButton : view.digitButtons) {
            digitButton.addActionListener(new DigitButtonListener());
        }

        for (JButton operatorButton : view.operatorButtons) {
            operatorButton.addActionListener(new OperatorButtonListener());
        }

        view.equalsButton.addActionListener(new EqualsButtonListener());
        view.dotButton.addActionListener(new DotButtonListener());
        view.nextDigit.addActionListener(new NextDigitListener());
        view.clearButton.addActionListener(new ClearButtonListener());
    }

    private class NextDigitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String currentText = view.getDisplayText();
            if(canAddDigit(currentText)){
                clearNaN();
                view.setDisplayText(currentText + " ");
            }
        }
        private boolean canAddDigit(String text) {
            if (text.isEmpty()) {
                return true;
            }

            char lastChar = text.charAt(text.length() - 1);
            return !(lastChar == ' ' || lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == 'N');
        }
    }

    private class DigitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String digit = source.getText();
            clearNaN();
            String currentText = view.getDisplayText();
            view.setDisplayText(currentText + digit);
        }
    }

    //обработка слушателей
    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String operator = source.getText();
            clearNaN();
            String currentText = view.getDisplayText();
            view.setDisplayText(currentText + " " + operator + " ");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String expression = view.getDisplayText();
            String[] tokens = expression.split("\\s+");
            double result = model.evaluateRPN(tokens);
            view.setDisplayText(Double.toString(result));
        }
    }

    //обработка нажатия точки полностью работает
    private class DotButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String currentText = view.getDisplayText();
            if(currentText.isEmpty() || !lastTokenIsNumber(currentText)){
                return;
            }
            if (lastTokenContainsDot(currentText)) {
                return;
            }
            clearNaN();
            view.setDisplayText(currentText + ".");
        }
        private boolean lastTokenIsNumber(String text){
            String[] tokens = text.split("\\s");
            String lastToken = tokens[tokens.length - 1];
            return lastToken.matches("\\d+(\\.\\d+)?");
        }
        private boolean lastTokenContainsDot(String text) {
            String[] tokens = text.split("\\s+");
            String lastToken = tokens[tokens.length - 1];
            return lastToken.contains(".");
        }
    }
    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setDisplayText(""); // Сбросить содержимое дисплея
        }
    }
    private void clearNaN() {
        String currentText = view.getDisplayText();
        if (currentText.equals("NaN")) {
            view.setDisplayText("");
        }
    }
}
