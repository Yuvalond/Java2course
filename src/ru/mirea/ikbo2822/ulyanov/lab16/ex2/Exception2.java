package ru.mirea.ikbo2822.ulyanov.lab16.ex2;

import java.util.Scanner;

public class Exception2 {
    /*
    qwerty - string , а ожидается integer
    0 - при делении на ноль выражение неопределенно
    1.2 - float , а ожидается integer
    Поэтому ошибки
     */
    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public static void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        //покрывает форматы не относящиеся к int
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        //покрывает деление на 0
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }


    public static void main(String[] args){
        exceptionDemo1();
        exceptionDemo2();
    }
}
