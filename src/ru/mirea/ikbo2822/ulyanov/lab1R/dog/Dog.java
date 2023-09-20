package ru.mirea.ikbo2822.ulyanov.lab1R.dog;

public class Dog {
    private String name;
    private int age;
    //Первый конструктор
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    //Второй конструктор
    public Dog(String n){
        name = n;
        age = 0;
    }
    //Конструктор по умолчанию
    public Dog(){
        name = "Pup";
        age = 0;
    }

    //СЕТТЕРЫ
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    //ГЕТТЕРЫ
    public String getName(String name){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public String toString(){
        return this.name+", age "+this.age;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}