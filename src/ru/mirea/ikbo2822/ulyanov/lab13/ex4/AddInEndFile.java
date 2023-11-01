package ru.mirea.ikbo2822.ulyanov.lab13.ex4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddInEndFile {
    public static void main(String[] args) {
        //append true , добавляет в конец файла
        try (FileWriter writer = new FileWriter("src/ru/mirea/ikbo2822/ulyanov/lab13/ex4/file3.txt", true)) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Запись в файл (для выхода написать 'exit'");

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;
                }
                writer.write(input + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
