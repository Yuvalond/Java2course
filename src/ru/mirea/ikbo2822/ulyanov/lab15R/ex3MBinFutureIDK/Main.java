package ru.mirea.ikbo2822.ulyanov.lab15R.ex3MBinFutureIDK;

public class Main {
    public static void main(String[] args) {
        FoodItem model = new FoodItem();
        CalorieCalculatorView view = new CalorieCalculatorView();
        CalorieCalculatorController controller = new CalorieCalculatorController(model, view);

        controller.initController();
    }
}