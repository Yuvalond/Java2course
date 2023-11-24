package ru.mirea.ikbo2822.ulyanov.lab13R.ex1;
//Реализовать запись в файл введённой с клавиатуры информации
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFromKeyboard {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/ru/mirea/ikbo2822/ulyanov/lab13/ex1/file1.txt")) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Запись в файл (для выхода написать 'exit'");

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;
                }
                writer.write(input + "\n");
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
