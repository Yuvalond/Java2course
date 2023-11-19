package ru.mirea.ikbo2822.ulyanov.lab15.ex2;

public class EmployeeMain {
    public static void main(String[] args){
    Employee employee = retrieveEmployeeFromDatabase();
    EmployeeView view = new EmployeeView();
    EmployeeController controller = new EmployeeController(employee,view);

    controller.updateView();
    }
    public static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("John Wick");
        employee.setHourlyRate(10.0);
        employee.setHoursWorked(40);
        return employee;
    }
}
