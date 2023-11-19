package ru.mirea.ikbo2822.ulyanov.lab20;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        // Отображение GUI калькулятора
        controller.view.setVisible(true);
    }
}
