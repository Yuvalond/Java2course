package ru.mirea.ikbo2822.ulyanov.lab19.ex2_3;

// 2. Написать класс, который умеет хранить в себе массив любых
// типов данных (int, long etc.).
public class GenericArray<T> {
    private T[] array;
    public GenericArray(int size){
        //создаю массив типа T с заданым размером
        //т.к напрямую создать массив T не получится, использую Object
        //и приведение типов
        array = (T[]) new Object[size];
    }

    public void set(int index, T value){
        array[index] = value;
    }
    // 3. Реализовать метод, который возвращает любой элемент массива
    // по индексу
    public T get(int index){
        return array[index];
    }

    public static void main(String[] args){
        GenericArray<Integer> intArray = new GenericArray<>(2);
        intArray.set(0,10);
        intArray.set(1,20);
        System.out.println("Integer Array: " + intArray.get(0) + ", " + intArray.get(1));
        GenericArray<String> strArray = new GenericArray<>(2);
        strArray.set(0, "Hello");
        strArray.set(1, "World");
        System.out.println("String Array: " + strArray.get(0) + " " + strArray.get(1));
    }
}
