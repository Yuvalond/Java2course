package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО1",232,4));
        s.add(new Student("ФИО2",124,3));
        s.add(new Student("ФИО3",234,2));
        s.add(new Student("ФИО4",89706,5));
        s.add(new Student("ФИО5",23768,2));

        new LabClassUI(s);
    }
}
