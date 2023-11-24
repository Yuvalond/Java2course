package ru.mirea.ikbo2822.ulyanov.lab14R.ex2_3;

/**
 * BoundedWaitList -(ограниченный список ожидания) - емкость задается при создании,
 * нельзя записать больще чем указано в capacity(емкости)
 * @param <E> тип данных
 * @see WaitList
 */
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    /**
     * Конструктор для создания ограниченного списка ожидания с указанной вместительностью.
     *
     * @param capacity максимальная вместимость списка
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * Возвращает максимальную вместительность списка.
     *
     * @return максимальная вместимость
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity) {
            super.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
