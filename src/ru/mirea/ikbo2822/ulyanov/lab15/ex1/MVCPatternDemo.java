package ru.mirea.ikbo2822.ulyanov.lab15.ex1;

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
