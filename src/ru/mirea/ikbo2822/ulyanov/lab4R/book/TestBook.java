package ru.mirea.ikbo2822.ulyanov.lab4R.book;

// Создать класс, описывающий книгу (Book). В классе должны быть
//описаны нужные свойства книги(автор, название, год написания и т. д.)и
//методы для получения, изменения этих свойств. Протестировать работу класса
//в классе BookTest, содержащим метод статический main(String[] args).
public class TestBook {
    public static void main(String[] args) {
        // Создаю объект книгу
        Book myBook = new Book("Человек", "Жизнь", 2023);

        // Получаю и вывожу информацию о книге
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());

        // Меняю некоторые свойства книги
        myBook.setAuthor("Новый Автор");
        myBook.setTitle("Новое Название");
        myBook.setYear(2024);

        // Вывод информации о книге
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());
    }
}
