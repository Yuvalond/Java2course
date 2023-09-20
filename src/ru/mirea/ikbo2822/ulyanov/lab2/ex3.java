package ru.mirea.ikbo2822.ulyanov.lab2;

public class ex3 {
    public static void main(String[] args) {
        //3. Вывести на экран первые 10 чисел гармонического ряда
        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i; // Рассчитываем число ряда
            sum += harmonicNumber;
            System.out.println("Число " + i + " : " + sum); // Выводим на экран
        }
    }
}
