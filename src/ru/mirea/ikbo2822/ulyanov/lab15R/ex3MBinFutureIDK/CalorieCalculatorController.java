package ru.mirea.ikbo2822.ulyanov.lab15R.ex3MBinFutureIDK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalorieCalculatorController {
    private FoodItem model;
    private CalorieCalculatorView view;

    public CalorieCalculatorController(FoodItem model, CalorieCalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculateCalories() {
        double protein = view.getProtein();
        double fat = view.getFat();
        double carbohydrates = view.getCarbohydrates();

        model.setProtein(protein);
        model.setFat(fat);
        model.setCarbohydrates(carbohydrates);

        double calories = model.calculateCalories();

        view.setResult(calories);
    }
    public void addItemToList() {
        String item = String.format("Protein: %.2f g, Fat: %.2f g, Carbohydrates: %.2f g",
                view.getProtein(), view.getFat(), view.getCarbohydrates());

        view.addItemToList(item);
    }
    public void initController() {
        view.addCalculateButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCalories();
            }
        });
        view.addAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItemToList();
            }
        });
        view.AddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = view.getSelectedItem();
                if (selectedItem != null) {
                    System.out.println("Выбранный: " + selectedItem);
                }
            }
        });
        view.display();
    }
}
