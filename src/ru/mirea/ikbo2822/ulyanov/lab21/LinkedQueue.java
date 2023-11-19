package ru.mirea.ikbo2822.ulyanov.lab21;

import java.util.NoSuchElementException;

class LinkedQueue<T> extends AbstractQueue<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T removed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return removed;
    }

    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public static void testLinkedQueue() {
        Queue<Integer> queue = new LinkedQueue<>();

        // Проверка на добавление элементов
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

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
