package ru.mirea.ikbo2822.ulyanov.lab10R;

public class ex10 {
    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        } else {
            int digit = n % 10; //получаем первую цифру, которая будет последней
            return reverseNumber(n / 10, reversed * 10 + digit); // n/10 - удаляем число которое уже прогнали, сдвигаем влево на 1 наше число и добавляем то что отделили
        }
    }

    public static int reverseNumber(int n) {
        return reverseNumber(n, 0);
    }

    public static void main(String[] args) {
        int n = 12345;
        int reversed = reverseNumber(n);
        System.out.println(reversed);
    }
}
