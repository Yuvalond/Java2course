package ru.mirea.ikbo2822.ulyanov.lab21;
import java.util.NoSuchElementException;

// Реализация очереди на массиве с использованием переменных класса
public class ArrayQueueModule<T> implements Queue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public ArrayQueueModule() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(T element) {
        if (size == elements.length) {
            resize();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[front];
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T removed = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = -1;
    }

    private void resize() {
        int newSize = elements.length * 2;
        @SuppressWarnings("unchecked")
        T[] newElements = (T[]) new Object[newSize];
        int i = 0;
        while (!isEmpty()) {
            newElements[i++] = dequeue();
        }
        elements = newElements;
        size = i;
        front = 0;
        rear = i - 1;
    }
    public static void testArrayQueueModule() {
        Queue<String> queue = new ArrayQueueModule<>();

        // Проверка на добавление элементов
        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Cherry");

        // Проверка на размер
        System.out.println("Размер: " + queue.size()); // Размер очереди должен быть 3

        // Проверка на извлечение элементов
        System.out.println("Первый элемент: " + queue.element()); // Первый элемент
        System.out.println("Удалить из очереди и вернуть: " + queue.dequeue()); // Удалить и вернуть первый элемент

        // Проверка на пустоту очереди после извлечения
        System.out.println("Пустой? " + queue.isEmpty()); // Проверка на пустоту очереди
        queue.clear(); // Очистка очереди
        System.out.println("Пустой после удаления? " + queue.isEmpty()); // Проверка на пустоту после очистки
    }
}
