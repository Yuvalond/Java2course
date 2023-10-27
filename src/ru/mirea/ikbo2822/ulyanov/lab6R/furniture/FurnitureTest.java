package ru.mirea.ikbo2822.ulyanov.lab6R.furniture;

//Создать абстрактный класс, описывающий мебель. С помощью
//наследования реализовать различные виды мебели. Также создать класс
//FurnitureShop, моделирующий магазин мебели. Протестировать работу
//классов.

public class FurnitureTest {
    public static void main(String[] args) {
        //создал экзембляр класса FurnitureShop
        FurnitureShop shop = new FurnitureShop(4);
        //создал экзембляры классов chair и table
        Chair chair1 = new Chair("Стул 1", 100.0);
        Chair chair2 = new Chair("Стул 2", 120.0);
        Table table1 = new Table("Стол 1", 300.0);
        Table table2 = new Table("Стол 2", 300.0);
        //добавил их инвентарь магазина
        shop.addFurniture(chair1, 0);
        shop.addFurniture(chair2, 1);
        shop.addFurniture(table1, 2);
        shop.addFurniture(table2, 3);
        //вывел
        shop.displayInventory();
    }
}
