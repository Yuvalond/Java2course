package ru.mirea.ikbo2822.ulyanov.lab15R.ex1;
//Напишите реализацию программного кода по UML диаграмме,
//представленной на рисунке 15.2. Программа должна демонстрировать
//использование паттерна MVC
public class MVCPatternDemo {
    public static void main(String[] args){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }
    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("John");
        student.setRollNo("123");
        return student;
    }
}
