package ru.mirea.ikbo2822.ulyanov.lab15.ex3MBinFutureIDK;

public class FoodItem {
    private String name;
    private double protein;
    private double fat;
    private double carbohydrates;

    public FoodItem() {
        // Конструктор по умолчанию
    }

    public FoodItem(String name, double protein, double fat, double carbohydrates) {
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    // Геттеры и сеттеры для каждого атрибута

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double calculateCalories() {
        // Рассчет калорий на основе количества белка, жиров и углеводов
        // 4 ккал/г белка, 9 ккал/г жиров, 4 ккал/г углеводов
        double caloriesFromProtein = protein * 4;
        double caloriesFromFat = fat * 9;
        double caloriesFromCarbohydrates = carbohydrates * 4;

        return caloriesFromProtein + caloriesFromFat + caloriesFromCarbohydrates;
    }
}
