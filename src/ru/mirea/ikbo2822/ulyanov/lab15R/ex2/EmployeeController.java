package ru.mirea.ikbo2822.ulyanov.lab15R.ex2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(),model.getHourlyRate(), model.getHoursWorked(), model.calculateSalary());
    }
}
