package ru.mirea.ikbo2822.ulyanov.lab16.ex7;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public static void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    //обрабатывание одного и того же исключения в разных местах
    //для решения удалил блоки try-catch для всех методов кроме одного
    private static String getDetails(String key) {
        if(Objects.equals(key, "No")) {
            try {
                throw new Exception("Key set to No string");
            }
            catch (Exception e) {
                return "Catch exception " + e;
            }
        }
        return "data for " + key; }

    public static void main(String[] args) {
        getKey();
    }
}
