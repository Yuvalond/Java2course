package ru.mirea.ikbo2822.ulyanov.lab19.ex4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogContentReader {
    public static <T> void readAndPrintFirstFive(File directory){
        File[] files = directory.listFiles();
        if (files != null){
            List<T> fileList = new ArrayList<>();
            //Добавление содержимого каталога в список
            Arrays.stream(files).limit(5)//первые пять элементов
                    .map(file-> (T) file) // привожу File к типу T
                    .forEach(fileList::add);

            //Вывод
            System.out.println("First five elements:");
            fileList.forEach(System.out::println);
        }
        else{
            System.out.println("Directory is empty or doesn't exist");
        }
    }
    public static void main(String[] args) {
        File directory = new File("src/ru/mirea/ikbo2822/ulyanov/lab19/ex4/catalogfortest");
        readAndPrintFirstFive(directory);
    }
}
