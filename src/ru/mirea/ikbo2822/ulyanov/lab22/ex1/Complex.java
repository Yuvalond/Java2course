package ru.mirea.ikbo2822.ulyanov.lab22.ex1;
//Разработать программную реализацию по UML диаграмме,
//представленной на рисунке 22.1 с использованием изучаемых паттернов.
public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString(){
        return real + " + " + imaginary + "i";
    }

}
