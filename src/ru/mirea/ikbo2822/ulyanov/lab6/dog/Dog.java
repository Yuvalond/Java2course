package ru.mirea.ikbo2822.ulyanov.lab6.dog;

// Абстрактный класс, описывающий собаку
abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void bark(); // Абстрактный метод "гавкать"

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Возраст: " + getAge();
    }
}

// Подклассы, представляющие разные породы собак
class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Лабрадор " + getName() + " издал: Гав-гав!");
    }
    @Override
    public String toString() {
        return "Порода: Лабрадор, " + super.toString();
    }
}

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Бульдог " + getName() + " издал: Грр-грр!");
    }
    @Override
    public String toString() {
        return "Порода: Бульдог, " + super.toString();
    }
}
