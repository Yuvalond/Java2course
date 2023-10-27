package ru.mirea.ikbo2822.ulyanov.lab2R;

import java.util.Arrays;

public class ex1 {
    public static int OutSumNumbersWithFor(int[] mas){
        int result = 0;
        for (int i : mas) {
            result += i;
        }
        return result;
    }
    public static int OutSumNumbersWithWhile(int[] mas){
        int result = 0;
        int i = 0;
        while(mas.length > i){
            result += mas[i];
            i++;
        }
        return result;
    }
    public static int OutSumNumbersWithDoWhile(int[] mas){
        int result = 0;
        int i = 0;

        do {
            result += mas[i];
            i++;
        }
        while(mas.length > i);

        return result;
    }
    public static void main(String[] args){
        //1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
        int []mas = new int[10];
        for (int i = 0; mas.length > i; i++){
            mas[i] = i+1;
        }
        System.out.println(Arrays.toString(mas));
        int resultFor = OutSumNumbersWithFor(mas);
        int resultWhile = OutSumNumbersWithWhile(mas);
        int resultDoWhile = OutSumNumbersWithDoWhile(mas);
        System.out.println(resultFor);
        System.out.println(resultWhile);
        System.out.println(resultDoWhile);
    }
}