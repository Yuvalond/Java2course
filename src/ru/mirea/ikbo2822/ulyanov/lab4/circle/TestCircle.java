package ru.mirea.ikbo2822.ulyanov.lab4.circle;

public class TestCircle {
    public static void main(String[] args) {
        //Проверяю конструктор
        Circle myCircle = new Circle(5.0);
        //Проверяю методы
        double area = myCircle.calculateArea(); // Вычисляем площадь
        double perimeter = myCircle.calculatePeriemetr(); // Вычисляем длину окружности
        //Проверяю гетеры
        System.out.println("Радиус круга: " + myCircle.getRadius());
        System.out.println("Площадь круга: " + area);
        System.out.println("Длина окружности: " + perimeter);

        // Проверяю сетеры
        myCircle.setRadius(7.0);

        System.out.println("Новый радиус круга: " + myCircle.getRadius());
    }
}
