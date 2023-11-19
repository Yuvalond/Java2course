package ru.mirea.ikbo2822.ulyanov.lab22.ex3;

//Основа
public class Editor {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Editor(ICreateDocument documentFactory){
        this.documentFactory = documentFactory;
    }
    //NEW
    public void createNewDocument() {
        document = documentFactory.createNew();
    }
    //OPEN
    public void openDocument() {
        document = documentFactory.createOpen();
    }
    //SAVE
    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("Нет документов для сохранения");
        }
    }
    //EXIT
    public void closeDocument() {
        if (document != null) {
            document.close();
        } else {
            System.out.println("Нет документов для закрытия");
        }
    }
}
