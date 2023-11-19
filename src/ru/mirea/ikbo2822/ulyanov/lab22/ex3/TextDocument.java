package ru.mirea.ikbo2822.ulyanov.lab22.ex3;

//Конекретный текстовый документ
public class TextDocument implements IDocument{

    @Override
    public void open() {
        System.out.println("Открываем текстовый документ...");
    }

    @Override
    public void save() {
        System.out.println("Сохраняем документ...");
    }

    @Override
    public void close() {
        System.out.println("Закрываем документ...");
    }
}
