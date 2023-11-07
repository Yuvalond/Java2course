package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

import java.util.Comparator;

public class IDNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s1.getIDNumber() - s2.getIDNumber();
    }
}