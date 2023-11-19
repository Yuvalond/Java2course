package ru.mirea.ikbo2822.ulyanov.lab22.ex1;

public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex(0,0);
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        return new Complex(real,imaginary);
    }
}
