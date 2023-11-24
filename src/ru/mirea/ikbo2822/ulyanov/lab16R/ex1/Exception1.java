package ru.mirea.ikbo2822.ulyanov.lab16R.ex1;

public class Exception1 {
    /*
    В данном лучае проиходит деление 2/0
    Деление на ноль не имеет смысла и неопределенно, поэтому ошибка
    */
    public static void exceptionDemo1() {
        System.out.println( 2 / 0 );
    }
    /*
    В этом случае мы "ловим" эту ошибку и просто выводим сообщение
    при этом программа не завершает свою работу
    */
    public static void exceptionDemo2() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args){
        //exceptionDemo1();
        exceptionDemo2();
    }
}