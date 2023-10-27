package ru.mirea.ikbo2822.ulyanov.lab6R.dog;

//Создать абстрактный класс, описывающий собак(Dog). С помощью
//наследования реализовать различные породы собак. Протестировать работу
//классов.

public class TestDog {
    public static void main(String[] args) {
        // Тест Лабарадор
        Labrador labrador = new Labrador("Барон", 5);

        // Тест Сеттеров
        labrador.setName("Рекс");
        labrador.setAge(7);

        // Тест геттеров
        System.out.println("Имя: " + labrador.getName());
        System.out.println("Возраст: " + labrador.getAge());

        // Тест методов
        labrador.bark();
        System.out.println(labrador.toString());


        // Тест Бульдога
        Bulldog bulldog = new Bulldog("Макс", 3);

        // Тест Сеттеров
        bulldog.setName("Джек");
        bulldog.setAge(4);

        // Тест геттеров
        System.out.println("Имя: " + bulldog.getName());
        System.out.println("Возраст: " + bulldog.getAge());

        // Тест методов
        bulldog.bark();
        System.out.println(bulldog.toString());
    }
}
