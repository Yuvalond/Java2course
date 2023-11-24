package ru.mirea.ikbo2822.ulyanov.lab15R.ex2;
//Напишите реализацию программного кода, с использованием
//паттерна MVC для расчета заработной платы сотрудника предприятия.
//Предлагается использовать следующие классы.
//• Класс Employee – сотрудник будет выступать в качестве слоя
//модели
//• Класс EmployeeView будет действовать как слой представления.
//• Класс EmployeeContoller будет действовать как уровень
//контроллера
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
