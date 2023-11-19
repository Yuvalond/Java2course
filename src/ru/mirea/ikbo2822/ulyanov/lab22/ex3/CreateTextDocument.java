package ru.mirea.ikbo2822.ulyanov.lab22.ex3;

//фабрика для создания текстовых документов
public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
