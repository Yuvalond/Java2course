package ru.mirea.ikbo2822.ulyanov.lab14.ex2_3;

import java.util.Collection;


/**
 * Интерфейс представляющий список ожидания
 *
 * @param <E> тип элементов в списке ожидания
 */
public interface IWaitList<E> {
    /**
     * Добавление элемента в список ожидания
     *
     * @param element элемент для добавления
     */
    void add(E element);

    /**
     * удаление элемента
     *
     * @return удаленный элемент
     */
    E remove();

    /**
     * Проверяет, содержится ли элемент из коллекции в списке ожидания
     *
     * @param element элемент который проверяют
     * @return true, если элемент найден; false если не найден
     */
    boolean contains(E element);

    /**
    *  Проверяет, содержатся ли все элементы из коллекции в списке ожидания.
    *
    *  @param c коллекция элементов для проверки
    *  @return true, если все элементы найдены; false если не найдены
    */
    boolean containsAll(Collection<E> c);

    /**
    *  Проверяет пуст ли список ожидания
    *
    *  @return true, если список пуст; false если не пуст
    */
    boolean isEmpty();
}
