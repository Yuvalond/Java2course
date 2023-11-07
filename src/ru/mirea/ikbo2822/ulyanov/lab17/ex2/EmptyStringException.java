package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("Передана пустая строка ");
    }
}
