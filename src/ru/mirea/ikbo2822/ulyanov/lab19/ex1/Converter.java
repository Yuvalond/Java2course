package ru.mirea.ikbo2822.ulyanov.lab19.ex1;

import java.util.ArrayList;
import java.util.List;

// 1. Написать метод для конвертации массива строк/чисел в список
public class Converter {
    public static <T> List<T> arrayToList(T[] array){
        List<T> list = new ArrayList<>();
        for(T element : array){
            list.add(element);
        }
        return list;
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer List: " + intList);

        String[] strArray = {"apple", "banana", "orange"};
        List<String> strList = arrayToList(strArray);
        System.out.println("String List: " + strList);
    }
}
