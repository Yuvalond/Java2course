package ru.mirea.ikbo2822.ulyanov.lab22.ex2;

//Продукт
public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на Викторианском Стуле");
    }
}
