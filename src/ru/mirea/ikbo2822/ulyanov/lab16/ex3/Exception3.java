package ru.mirea.ikbo2822.ulyanov.lab16.ex3;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        //Теперь у нас перехватываются все исключения и выводятся на экран
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    public static void main(String[] args){
        exceptionDemo1();
        //qwerty 0 1.2
    }
}
