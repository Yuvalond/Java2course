package ru.mirea.ikbo2822.ulyanov.lab12R.ex2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class DrunkardQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPlayer1 = scanner.nextLine();
        String inputPlayer2 = scanner.nextLine();
        scanner.close();

        PriorityQueue<Integer> player1 = new PriorityQueue<>();
        PriorityQueue<Integer> player2 = new PriorityQueue<>();

        for (int i = 0; i < 5; i++) {
            player1.add(Integer.parseInt(String.valueOf(inputPlayer1.charAt(i))));
            player2.add(Integer.parseInt(String.valueOf(inputPlayer2.charAt(i))));
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.poll();
            int card2 = player2.poll();

            if (card1 > card2 && !(card1 == 9 && card2 == 0)) {
                player1.add(card2);
                player1.add(card1);
            }
            else {
                player2.add(card1);
                player2.add(card2);
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
