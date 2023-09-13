package ru.mirea.ikbo2822.ulyanov.lab5;

import java.util.Scanner;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        int count = countOnes();
        System.out.println("Число 1 встречается " + count + " раз.");
    }

    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        boolean reading = true;

        while (reading) {
            int number = scanner.nextInt();

            if (number == 0) {
                number = scanner.nextInt();
                if (number == 0) {
                    reading = false; // Если встречены два нуля подряд, завершаем чтение
                }
            } else if (number == 1) {
                count++; // Увеличиваем счетчик, если встретилась единица
            }
        }

        return count;
    }
}
