package ru.mirea.ikbo2822.ulyanov.lab2R;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        //4. Сгенерировать массив целых чисел случайным образом, вывести его
        //на экран, отсортировать его, и снова вывести на экран.
        int []mas = new int[10];
        //заполнил рандомом
        for (int i = 0; mas.length > i; i++){
            mas[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(mas));
        //сортировка
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
