package ru.mirea.ikbo2822.ulyanov.lab16R.ex8;

import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey() {
        boolean value = true;

        while (value) {
            try {
                Scanner myScanner = new Scanner(System.in);
                String key = myScanner.next();
                if (key.equals("No")) {
                    throw new Exception("No string");
                }
                printDetails(key);
                value = false;
            }
            catch (Exception e) {
                System.out.println("Введенный данные некорректны, повторите попытку");
            }
        }
    }
    public static void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    private static String getDetails(String key) {
        return "data for " + key; }

    public static void main(String[] args) {
        getKey();
    }
}
