package ru.mirea.ikbo2822.ulyanov.lab18.ex1_3;

// 1. Создать обобщенный класс с тремя параметрами (T, V, K).

import java.io.Serializable;

// 3. Наложить ограничения на параметры типа: T должен реализовать
// интерфейс Comparable (классы оболочки, String), V должен реализовать
// интерфейс Serializable и расширять класс Animal, K.
public class GenericClass<T extends Comparable<T>, V extends Serializable/* & Animal*/,K> {
    // 2. Класс содержит три переменные типа (T, V, K)
    private T t;
    private V v;
    private K k;

    // 2. конструктор, принимающий на вход параметры типа (T, V, K)
    public GenericClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    //2. методы возвращающие значения трех переменных
    public T getT() {
        return t;
    }
    public V getV() {
        return v;
    }
    public K getK() {
        return k;
    }

    //Создать метод, выводящий на консоль имена классов для трех переменных класса.
    public void printClassNames() {
        System.out.println("Class name of T: " + t.getClass().getName());
        System.out.println("Class name of V: " + v.getClass().getName());
        System.out.println("Class name of K: " + k.getClass().getName());
    }

    public static void main(String[] args){
        GenericClass gc = new GenericClass("string",1,"string2");

        System.out.println(gc.getT());
        System.out.println(gc.getV());
        System.out.println(gc.getK());

        gc.printClassNames();
    }

}
