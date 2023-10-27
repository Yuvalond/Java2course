package ru.mirea.ikbo2822.ulyanov.lab2R;

public class ex3 {
    public static void main(String[] args) {
        //3. Вывести на экран первые 10 чисел гармонического ряда 1/1 1/2 1/3 1/4 1/5 1/6....
        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i; // Рассчитываем число ряда
            sum += harmonicNumber;
            System.out.println("Число " + i + " : " + sum); // Выводим на экран
        }
    }
}
