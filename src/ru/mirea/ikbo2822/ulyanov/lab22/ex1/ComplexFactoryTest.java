package ru.mirea.ikbo2822.ulyanov.lab22.ex1;

public class ComplexFactoryTest {
    public static void main(String[] args){
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        System.out.println("Complex Number 1: " + complex1);

        Complex complex2 = factory.createComplex(5,2);
        System.out.println("Complex Number 2: " + complex2);
    }
}
