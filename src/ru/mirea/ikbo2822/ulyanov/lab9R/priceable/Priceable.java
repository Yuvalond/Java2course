package ru.mirea.ikbo2822.ulyanov.lab9R.priceable;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Service implements Priceable {
    private String name;
    private double hourlyRate;

    public Service(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }
}
