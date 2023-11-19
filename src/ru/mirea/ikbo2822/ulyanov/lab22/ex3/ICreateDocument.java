package ru.mirea.ikbo2822.ulyanov.lab22.ex3;

//Интерфейс фабрики по созданию документов
public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}
