package ru.mirea.ikbo2822.ulyanov.lab22.ex3;

//Легенда “Компании ХХХ нужно написать редактор текста, редактор
//изображений и редактор музыки. В трёх приложениях будет очень много
//общего: главное окно, панель инструментов, команды меню будут весьма
//схожими. Чтобы не писать повторяющуюся основу трижды, вам поручили
//разработать основу (каркас) приложения, которую можно использовать во
//всех трёх редакторах.”
//На совещании в компании была принята следующая архитектура
//проекта:
//Исходные данные. Есть некий базовый интерфейс IDocument,
//представляющий документ неопределённого рода. От него впоследствии
//будут унаследованы конкретные документы: TextDocument, ImageDocument,
//MusicDocument и т.п. Интерфейс IDocument перечисляет общие свойства и
//операции для всех документов.

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
