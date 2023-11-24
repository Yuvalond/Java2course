package ru.mirea.ikbo2822.ulyanov.lab16R.ex4;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        //этот блок работает в независимости от того произошло ли исключение.
        finally{
            myScanner.close();
            System.out.println("Scanner closed");
        }
    }


    public static void main(String[] args){
        exceptionDemo1();
        //qwerty 0 1.2
    }
}
