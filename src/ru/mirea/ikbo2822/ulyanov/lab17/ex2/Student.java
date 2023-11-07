package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

public class Student implements Comparable<Student>{
   private String fio;
    private int iDNumber;
    private double GPA;

    public static final GPAComparator GPA_COMPARATOR = new GPAComparator();
    public static final IDNumberComparator IDNumber_COMPARATOR = new IDNumberComparator();

    public Student(String fio, int iDNumber, double GPA) {
        this.fio = fio;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getFio(){
        return fio;
    }
    public int getIDNumber() {
        return iDNumber;
    }
    public double getGPA() {
        return GPA;
    }

    public void setFio(String fio) {
        if(fio.equals(""))
            throw new EmptyStringException();
        this.fio = fio;
    }
    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    @Override
    public String toString() {
        return "Ученик" +
                " ФИО ='" + fio + '\'' +
                ", IDNumber = " + iDNumber +
                ", GPA = " + GPA + " ";
    }
    @Override
    public int compareTo(Student s){
        return this.fio.compareTo(s.fio);
    }
}

