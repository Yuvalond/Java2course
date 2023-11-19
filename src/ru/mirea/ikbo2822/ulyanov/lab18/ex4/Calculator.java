package ru.mirea.ikbo2822.ulyanov.lab18.ex4;

//4. Написать класс Калькулятор (необобщенный), который
//содержит обобщенные статические методы - sum, multiply, divide, subtraction.
//Параметры этих методов - два числа разного типа, над которыми должна быть
//произведена операция.

public class Calculator {
    public static <T extends Number, V extends Number> T sum(T a, V b){
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        }
        else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        }
        else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        }
        else if (a instanceof Integer || b instanceof Integer){
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
        else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }
    public static <T extends Number, V extends Number> T multiply(T a, V b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        }
        else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        }
        else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        }
        else if (a instanceof Integer || b instanceof Integer){
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
        else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number, V extends Number> T divide(T a, V b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        }
        else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        }
        else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        }
        else if (a instanceof Integer || b instanceof Integer){
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
        else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number, V extends Number> T subtraction(T a, V b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        }
        else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        }
        else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        }
        else if (a instanceof Integer || b instanceof Integer){
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
        else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }
}
