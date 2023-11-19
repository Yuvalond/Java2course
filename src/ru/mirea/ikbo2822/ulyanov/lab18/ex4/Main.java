package ru.mirea.ikbo2822.ulyanov.lab18.ex4;

public class Main {
    public static void main(String[] args){
        // Пример использования класса MinMax
        Integer[] intArray = {3, 1, 7, 4, 5};
        MinMax<Integer> minMaxInteger = new MinMax<>(intArray);
        System.out.println("Min integer: " + minMaxInteger.findMin());
        System.out.println("Max integer: " + minMaxInteger.findMax());

        Double[] doubleArray = {3.5, 1.2, 7.8, 4.1, 5.9};
        MinMax<Double> minMaxDouble = new MinMax<>(doubleArray);
        System.out.println("Min double: " + minMaxDouble.findMin());
        System.out.println("Max double: " + minMaxDouble.findMax());

        // Пример использования класса Calculator
        int num1 = 10;
        double num2 = 5;

        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiply(num1, num2));
        System.out.println("Division: " + Calculator.divide(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtraction(num1, num2));
    }
}
