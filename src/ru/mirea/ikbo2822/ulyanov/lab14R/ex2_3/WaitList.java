package ru.mirea.ikbo2822.ulyanov.lab14R.ex2_3;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Реализация списка ожидания с использованием ConcurrentLinkedQueue
 * и интерфейса IWaitList.
 *
 *
 * @param <E> тип данных
 * @see IWaitList
 */
public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;
    /**
     * Конструктор для создания пустого списка ожидания.
     */
    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Конструктор для создания списка ожидания из коллекции.
     *
     * @param c коллекция элементов
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }


    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString(){
        return content.toString();
    }
}
