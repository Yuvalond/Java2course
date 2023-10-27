package ru.mirea.ikbo2822.ulyanov.lab12R.ex1;

import java.util.Scanner;
import java.util.Stack;

// стек - первый вошел, последний вышел
public class DrunkardStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPlayer1 = scanner.nextLine();
        String inputPlayer2 = scanner.nextLine();
        scanner.close();

        //создаю стек
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        //записываю карты в стек
        for (int i = 4; i >= 0; i--) {
            player1.push(Integer.parseInt(String.valueOf(inputPlayer1.charAt(i))));
            player2.push(Integer.parseInt(String.valueOf(inputPlayer2.charAt(i))));
        }

        int moves = 0;
        //пока стек не пустой и ходы не достигли лимита
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.pop();
            int card2 = player2.pop();

            if (card1 > card2 && !(card1 == 9 && card2 == 0)) {
                player1.add(0, card2);
                player1.add(0, card1);
            }
            else {
                player2.add(0, card1);
                player2.add(0, card2);
            }
            moves++;
        }

        if (moves == 106) {
            System.out.println("botva");
        }
        else if (player1.isEmpty()) {
            System.out.println("second " + moves);
        }
        else {
            System.out.println("first " + moves);
        }
    }
}
