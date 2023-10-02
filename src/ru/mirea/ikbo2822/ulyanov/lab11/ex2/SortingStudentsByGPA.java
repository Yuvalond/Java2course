package ru.mirea.ikbo2822.ulyanov.lab11.ex2;

import ru.mirea.ikbo2822.ulyanov.lab11.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем по GPA в обратном порядке (убывание)
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    // Реализация алгоритма быстрой сортировки
    public void quickSort(Student[] students, int low, int high) {
        if (low < high) { //если true массив больше чем 1 элемент, нужно сортировать
            int pi = partition(students, low, high); //разбиение на меньшее и большее опоры
            quickSort(students, low, pi - 1); //левая часть
            quickSort(students, pi + 1, high); //правая часть
        }
    }

    private int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGPA(); // опорный элемент
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students[j].getGPA() >= pivot) { // если GPA >= опоре
                i++; //сдвиг на GPA которое больше либо равно опоре

                //перемещаем элемент налево
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // перемещение опорного элемента на правильную позицию
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student(1, 3.5),
                new Student(2, 4.0),
                new Student(3, 3.2),
                new Student(4, 3.8)
        };

        // объект SortingStudentsByGPA
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();

        // Сортировка по GPA с использованием алгоритма быстрой сортировки
        comparator.quickSort(students, 0, students.length - 1);

        // Вывод отсортированного массива
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }
}
