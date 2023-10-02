package ru.mirea.ikbo2822.ulyanov.lab12.ex3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardDequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPlayer1 = scanner.nextLine();
        String inputPlayer2 = scanner.nextLine();
        scanner.close();

        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            player1.offerLast(Integer.parseInt(String.valueOf(inputPlayer1.charAt(i))));
            player2.offerLast(Integer.parseInt(String.valueOf(inputPlayer2.charAt(i))));
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.pollFirst();
            int card2 = player2.pollFirst();

            if (card1 > card2 && !(card1 == 9 && card2 == 0)) {
                player1.offerLast(card1);
                player1.offerLast(card2);
            } else {
                player2.offerLast(card2);
                player2.offerLast(card1);
            }

            moves++;
        }

        if (moves == 106) {
            System.out.println("botva");
        } else if (player1.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}
