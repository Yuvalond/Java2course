package ru.mirea.ikbo2822.ulyanov.lab23_24;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;
    public static final double DEFAULT_COST = 0.0;

    Drink(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid parameters for creating Drink");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description){
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
