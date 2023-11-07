package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student>
{
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }
}
