package ru.mirea.ikbo2822.ulyanov.lab15.ex2;

public class EmployeeView {
    public void printEmployeeDetails(String name, double hourlyRate, int hoursWorked, double salary) {
        System.out.println("Employee: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + salary);
    }
}
