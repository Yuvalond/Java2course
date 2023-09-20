package ru.mirea.ikbo2822.ulyanov.lab2;

public class ex2 {
    public static void main(String[] args) { //спросить а зачем этот масив собствено говоря
        //2. Вывести на экран аргументы командной строки в цикле for.
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
