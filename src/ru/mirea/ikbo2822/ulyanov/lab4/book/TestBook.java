package ru.mirea.ikbo2822.ulyanov.lab4.book;

public class TestBook {
    public static void main(String[] args) {
        // Создаем объект книги
        Book myBook = new Book("Человек", "Жизнь", 2023);

        // Получаем и выводим информацию о книге
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());

        // Меняем некоторые свойства книги
        myBook.setAuthor("Новый Автор");
        myBook.setTitle("Новое Название");
        myBook.setYear(2024);

        // Получаем и выводим обновленную информацию о книге
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());
    }
}
