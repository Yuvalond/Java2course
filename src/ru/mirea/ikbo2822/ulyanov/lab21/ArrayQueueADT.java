package ru.mirea.ikbo2822.ulyanov.lab21;
// Абстрактный класс для очереди в виде абстрактного типа данных
abstract class ArrayQueueADT<T> implements Queue<T> {
    protected T[] elements;
    protected int size;
    protected int front;
    protected int rear;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = null;
        size = 0;
        front = 0;
        rear = -1;
    }
}
