package ru.mirea.ikbo2822.ulyanov.lab9R.nameable;

// Создаем интерфейс Nameable
interface Nameable {
    String getName();
}

// Пример класса планеты
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример класса машины
class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример класса животного
class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
