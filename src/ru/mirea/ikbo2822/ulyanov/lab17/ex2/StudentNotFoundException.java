package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String name){
        super("Ученик с ФИО <<" + name + ">> не найден ");
    }
}
