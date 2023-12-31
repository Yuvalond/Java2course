package ru.mirea.ikbo2822.ulyanov.lab21;

// Инвариант: Размер очереди всегда равен количеству элементов в ней.
//            Пустая очередь: size() == 0
//            Непустая очередь: size() > 0

public interface Queue <T>{
    //=============== Добавить элемент в очередь ================
    // предусловие: элемент != null
    // постусловие: элемент добавлен в конец очереди
    void enqueue(T element);

    // ============== Первый элемент в очереди =================
    // предусловие: очередь не пуста
    // постусловие: возвращает первый элемент очереди
    T element();

    // ============== Удаление из очереди ======================
    // предусловие: очередь не пуста
    // постусловие: удаляет и возвращает первый элемент очереди
    T dequeue(); // удалить и вернуть первый элемент из очереди

    // =============== Получения размера очереди ===============
    // постусловие: возвращает текущий размер очереди
    int size();

    // =============== Проверка на пустоту очередь =============
    // постусловие: возвращает true, если очередь пуста, иначе - false
    boolean isEmpty();

    // =============== Удалить все элементы из очереди ==========
    // постусловие: очищает очередь, size() == 0
    void clear();
}
