package ru.mirea.ikbo2822.ulyanov.lab12.ex5;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        System.out.println("Введите 5 карт первого игрока:");
        String inputPlayer1 = scanner.nextLine();
        for (int i = 4; i >= 0; i--) {
            player1.push(Integer.parseInt(String.valueOf(inputPlayer1.charAt(i))));
        }

        System.out.println("Введите 5 карт второго игрока:");
        String inputPlayer2 = scanner.nextLine();
        for (int i = 4; i >= 0; i--) {
            player2.push(Integer.parseInt(String.valueOf(inputPlayer2.charAt(i))));
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.pop();
            int card2 = player2.pop();

            if (card1 > card2 && !(card1 == 9 && card2 == 0)) {
                player1.add(0, card2);
                player1.add(0, card1);
            } else {
                player2.add(0, card1);
                player2.add(0, card2);
            }

            moves++;

            System.out.println("Ход " + moves + ":");
            System.out.println("Карты первого игрока: " + player1);
            System.out.println("Карты второго игрока: " + player2);

            if (moves < 106) {
                System.out.print("Продолжить игру? (y/n): ");
                String userInput = scanner.nextLine();
                if (!userInput.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }

        if (moves == 106) {
            System.out.println("botva");
        } else if (player1.isEmpty()) {
            System.out.println("Второй игрок победил! Ходов: " + moves);
        } else {
            System.out.println("Первый игрок победил! Ходов: " + moves);
        }

        scanner.close();
    }
}
