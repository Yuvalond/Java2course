package ru.mirea.ikbo2822.ulyanov.lab13R.ex3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// Заменить информацию в файле на информацию, введённую
// клавиатуры
public class ChangeInFileWithKeyboard {
    public static void main(String[] args) {
        //append false , перезаписывает файл
        try (FileWriter writer = new FileWriter("src/ru/mirea/ikbo2822/ulyanov/lab13/ex3/file2.txt", false)) {
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

