package ru.mirea.ikbo2822.ulyanov.lab22.ex3;

public class Main {
    public static void main(String[] args){
        //Создаю фабрику документов
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        //Создаю текстовый файл с помощью фабрики
        Editor textEditor = new Editor(textDocumentFactory);

        //тестирую методы
        textEditor.createNewDocument();

        textEditor.openDocument();

        textEditor.saveDocument();

        textEditor.closeDocument();
    }
}
