package ru.mirea.ikbo2822.ulyanov.lab6R.dishes;

//Создать абстрактный класс, описывающий посуду(Dish). С помощью
//наследования реализовать различные виды посуды, имеющие свои свойства и
//методы. Протестировать работу классов.
public class TestDish {
    public static void main(String[] args) {
        //Создаю класс plate
        Plate plate = new Plate("Керамика", 20, 5);

        //Проверка гетеров plate
        System.out.println("Тарелка:");
        System.out.println("Материал: " + plate.getMaterial());
        System.out.println("Размер: " + plate.getSize());
        System.out.println("Глубина: " + plate.getDepth());

        //Проверка методов plate
        plate.use();
        System.out.println(plate);

        //Проверка сеттеров plate
        plate.setMaterial("Фарфор");
        plate.setSize(25);
        plate.setDepth(6);
        System.out.println("Новый материал: " + plate.getMaterial());
        System.out.println("Новый размер: " + plate.getSize());
        System.out.println("Новая глубина: " + plate.getDepth());

        System.out.println();

        //Создаю класс cup
        Cup cup = new Cup("Стекло", 10, true);

        System.out.println("Кружка:");
        System.out.println("Материал: " + cup.getMaterial());
        System.out.println("Размер: " + cup.getSize());
        System.out.println("Наличие ручки: " + cup.getHandle());

        //Проверка методов cup
        cup.use();
        System.out.println(cup);

        //Проверка сеттеров cup
        cup.setMaterial("Керамика");
        cup.setSize(5);
        cup.setHandle(false);
        System.out.println("Новый материал: " + cup.getMaterial());
        System.out.println("Новый размер: " + cup.getSize());
        System.out.println("Есть ли ручка в изменении: " + cup.getHandle());
    }
}
