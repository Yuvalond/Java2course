package ru.mirea.ikbo2822.ulyanov.lab14R.ex2_3;

import java.util.ArrayList;
import java.util.List;
//Изучение работу метода main(), которая использует ваши новые
//классы и интерфейс.
public class Main {
    public static void main(String[] args){
        // Использования BoundedWaitList хранящего коллекцию Integer
        WaitList<Integer> list1 = new BoundedWaitList<>(5);

        // метод add
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Этот элемент не будет добавлен, так как вместимость - 5
        list1.add(6);
        System.out.println("BoundedWaitList с :  " + list1);

        // Использование UnfairWaitList хранящего коллекцию String
        WaitList<String> list2 = new UnfairWaitList<>();

        // метод add
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println("UnfairWaitList в начале: " + list2);

        // метод remove
        list2.content.remove("B");
        System.out.println("UnfairWaitList после удаления (B): " + list2);

        // Метод contains
        System.out.println("UnfairWaitList содержит ли 'C': "+ list2.contains("C"));
        //метод containsAll
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println("UnfairWaitList содержит ли list 2 все элементы коллекции list3: "+ list2.content.containsAll(list3));
        //метод isEmpty
        WaitList<String> list4 = new UnfairWaitList<>();
        System.out.print("Пустой ли UnfairWaitList 4?: " + list4.isEmpty());

    }
}
