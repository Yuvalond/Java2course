package ru.mirea.ikbo2822.ulyanov.lab13.ex2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OutFromFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/ru/mirea/ikbo2822/ulyanov/lab13/ex1/file1.txt")) {
            Scanner scanner = new Scanner(reader);

            System.out.println("Вывод из файла:");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
