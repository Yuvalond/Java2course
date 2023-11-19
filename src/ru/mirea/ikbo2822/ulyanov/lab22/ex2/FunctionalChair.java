package ru.mirea.ikbo2822.ulyanov.lab22.ex2;

//Продукт
public class FunctionalChair implements Chair{

    @Override
    public void sit() {
        System.out.println("Вы сидите на Функциональном Стуле");
    }

    public int sum(int a,int b){
        return a+b;
    }
}
