package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

import java.util.ArrayList;
//Предлагается модернизировать задачу из предыдущей
//практической работы (см. методические указания по выполнению
//практических работ №1-8) – задача сортировки студентов по среднему баллу.
//Необходимо разработать пользовательский интерфейс для задачи поиска и
//сортировки (использовать массив интерфейсных ссылок- пример в лекции 5).
//Дополнить ее поиском студента по фио – в случае отсутствия такого студента
//Выдать исключение
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
