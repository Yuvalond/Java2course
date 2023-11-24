package ru.mirea.ikbo2822.ulyanov.lab14R.ex2_3;


/**
 * UnfairWaitList (несправедливый список ожидания) - позволяет удалить из очереди
 * элемент, находящийся где угодно в списке, так же можно реализовать так что
 * бы элемент отправлялся в конец списка (перемещается в конец очереди)
 *
 * @param <E> тип данных
 * @see WaitList
 */



public class UnfairWaitList<E> extends WaitList<E>{
    /**
     * Конструктор для создания несправедливого списка ожидания.
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Удаляет элемент из списка ожидания.
     *
     * @param element элемент для удаления
     */

    public void remove(E element) {
        boolean removed = false;
        for(int i = 0; i < content.size();i++){
            E el = content.remove();
            if(!removed && el.equals(element)){
                removed = true;
            }
            else{
                content.add(el);
            }
        }
        if (removed){
            content.add(content.remove());
        }
    }

    /**
     * Перемещает элемент в конец списка.
     *
     * @param element элемент для перемещения
     */
    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }

    @Override
    public String toString() {
        return "UnfairWaitList{" +
                "content=" + content +
                '}';
    }
}
