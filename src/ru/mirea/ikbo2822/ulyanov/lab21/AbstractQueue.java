package ru.mirea.ikbo2822.ulyanov.lab21;

// Базовый класс AbstractQueue с общей логикой для LinkedQueue и ArrayQueue
abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}
