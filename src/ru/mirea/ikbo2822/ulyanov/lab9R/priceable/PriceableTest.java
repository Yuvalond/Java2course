package ru.mirea.ikbo2822.ulyanov.lab9R.priceable;

//Реализовать интерфейс Priceable, имеющий метод getPrice(),
//возвращающий некоторую цену для объекта. Проверить работу для различных
//классов, сущности которых могут иметь цену
public class PriceableTest {
    public static void main(String[] args) {
        Priceable product = new Product("Клавиатура", 1500.00);
        Priceable service = new Service("Услуги по ремонту", 500.00);

        System.out.println("Цена продукта: " + product.getPrice());
        System.out.println("Часовая ставка за услуги: " + service.getPrice());
    }
}
