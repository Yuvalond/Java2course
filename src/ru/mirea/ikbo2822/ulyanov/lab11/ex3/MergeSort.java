package ru.mirea.ikbo2822.ulyanov.lab11.ex3;
import ru.mirea.ikbo2822.ulyanov.lab11.Student;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    //Разбивание до еденичных массивов и склейка
    public static List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = new ArrayList<>(list.subList(0, mid));
        List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        //Сливаем две части в 1
        List<Student> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                result.add(left.get(i));
                i++;
            }
            else {
                result.add(right.get(j));
                j++;
            }
        }

        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(3, 3.5));
        list1.add(new Student(1, 4.0));
        list1.add(new Student(2, 3.2));
        list1.add(new Student(4, 3.8));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(5, 2.8));
        list2.add(new Student(6, 3.9));

        List<Student> mergedList = mergeSort(new ArrayList<>(list1));
        mergedList.addAll(mergeSort(new ArrayList<>(list2)));

        for (Student student : mergedList) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }
}
