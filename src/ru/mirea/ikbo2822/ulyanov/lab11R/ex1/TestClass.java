package ru.mirea.ikbo2822.ulyanov.lab11R.ex1;

import ru.mirea.ikbo2822.ulyanov.lab11R.Student;

public class TestClass {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student(3, 3.5),
                new Student(1, 4.0),
                new Student(2, 3.2),
                new Student(4, 3.8)
        };

        // Сортируем массив вставками
        insertionSort(students);

        // Выводим отсортированный массив
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }
}
