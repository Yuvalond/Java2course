package ru.mirea.ikbo2822.ulyanov.lab11R;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private double GPA;

    public Student(int iDNumber, double GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student other) {
        // Сравниваем по iDNumber
        return Integer.compare(this.iDNumber, other.iDNumber);
    }
}
