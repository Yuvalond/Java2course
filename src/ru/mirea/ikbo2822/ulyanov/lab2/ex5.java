package ru.mirea.ikbo2822.ulyanov.lab2;

public class ex5 {
    public static long factorial(int num){
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        //5. Создать метод, вычисляющую факториал числа с помощью
        // цикла, проверить работу метода.
        int num = 10; //вводит факториал для какого числа
        long resultFactorial = factorial(num);
        System.out.println(resultFactorial);
    }
}
