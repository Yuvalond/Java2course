package ru.mirea.ikbo2822.ulyanov.lab22.ex2;

//Продукт
public class MagicChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Вы сидите на Магическом Стуле");
    }
    public void doMagic(){
        System.out.println("МэДжИк...");
    }
}
