package ru.mirea.ikbo2822.ulyanov.lab12R.ex4;

import java.util.LinkedList;

import java.util.Scanner;

public class DrunkardDoubleList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPlayer1 = scanner.nextLine();
        String inputPlayer2 = scanner.nextLine();
        scanner.close();

        LinkedList<Integer> player1 = new LinkedList<>();
        LinkedList<Integer> player2 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            player1.addLast(Integer.parseInt(String.valueOf(inputPlayer1.charAt(i))));
            player2.addLast(Integer.parseInt(String.valueOf(inputPlayer2.charAt(i))));
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.removeFirst();
            int card2 = player2.removeFirst();

            if (card1 > card2 && !(card1 == 9 && card2 == 0)) {
                player1.addLast(card1);
                player1.addLast(card2);
            } else {
                player2.addLast(card2);
                player2.addLast(card1);
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
