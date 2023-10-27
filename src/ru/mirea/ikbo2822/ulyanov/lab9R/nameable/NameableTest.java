package ru.mirea.ikbo2822.ulyanov.lab9R.nameable;
//Создать интерфейс Nameable, с методом getName(), возвращающим
//имя объекта, реализующего интерфейс. Проверить работу для различных
//объектов (например, можно создать классы, описывающие разные сущности,
//которые могут иметь имя: планеты, машины, животные и т. д.).
public class NameableTest {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Тоёта");
        Nameable animal = new Animal("Лев");

        System.out.println("Название планеты: " + planet.getName());
        System.out.println("Название машины: " + car.getName());
        System.out.println("Название животного: " + animal.getName());
    }
}
