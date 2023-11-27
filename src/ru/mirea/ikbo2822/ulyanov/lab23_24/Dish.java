package ru.mirea.ikbo2822.ulyanov.lab23_24;

public final class Dish implements Item {
    private final double cost;
    private final String name;
    private final String description;
    public static final double DEFAULT_COST = 0.0;

    Dish(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid parameters for creating Dish");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Dish(String name, String description){
        this.cost = DEFAULT_COST;
        this.name = name;
        this.description = description;
    }
    @Override
    public double getCost() {
        return cost;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
