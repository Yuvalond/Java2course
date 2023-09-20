package ru.mirea.ikbo2822.ulyanov.lab1R.dog;
public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog();

        d3.setAge(1);
        d3.setName("Bobik");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
