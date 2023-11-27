package ru.mirea.ikbo2822.ulyanov.lab17.ex2;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {
    private ArrayList<Student> students;
    private JTable studentTable;

    public LabClassUI(ArrayList<Student> students){
        super("Таблица Учеников");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,240);
        setLocationRelativeTo(null);
        this.students = students;

        JPanel panel = new JPanel(new FlowLayout());
        JButton addStudentBtn = new JButton("Добавить Ученика");
        JButton delStudentBtn = new JButton("Удалить Ученика");
        JButton findStudentBtn = new JButton("Найти Ученика");

        panel.add(addStudentBtn);
        panel.add(delStudentBtn);
        panel.add(findStudentBtn);

        addStudentBtn.addActionListener(e -> {
            try{
                addBtnClicked();
            }
            catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        });

        delStudentBtn.addActionListener(e-> delBtnClicked());

        findStudentBtn.addActionListener(e-> {
            try{
                findBtnClicked();
            }
            catch(StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        Object [] headers = new String[] {"ФИО", "IDNumber" , "GPA"};
        Object [][] startStudents = new String[students.size()][3];

        for (int i = 0; i < students.size();i++){
            startStudents[i][0] = students.get(i).getFio();
            startStudents[i][1] = ((Integer)(students.get(i).getIDNumber())).toString();
            startStudents[i][2] = ((Double)(students.get(i).getGPA())).toString();
        }

        studentTable = new JTable(new DefaultTableModel(startStudents, headers)){
          @Override
          public boolean isCellEditable(int x,int y){
              return false;
          }
        };
        JTableHeader header = studentTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);

        header.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count = e.getClickCount();
                if (count == 1){
                    if(header.getHeaderRect(0).contains(e.getX(), e.getY()))
                        sortStudents(Student::compareTo);
                    if(header.getHeaderRect(1).contains(e.getX(), e.getY()))
                        sortStudents(Student.IDNumber_COMPARATOR);
                    if(header.getHeaderRect(2).contains(e.getX(), e.getY()))
                        sortStudents(Student.GPA_COMPARATOR);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        getContentPane().add(new JScrollPane(studentTable), BorderLayout.CENTER);
        getContentPane().add(panel,BorderLayout.NORTH);

        setVisible(true);
    }

    private void sortStudents(Comparator<Student> comp){
        Student temp;
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        DefaultTableModel dtm = (DefaultTableModel) studentTable.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student st = students.get(i);
            dtm.insertRow(i, new Object[]{st.getFio(), st.getIDNumber(), st.getGPA()});
        }
    }
    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите искомые ФИО");
        for (Student student : students) {
            if (student.getFio().equals(s)) {
                JOptionPane.showMessageDialog(this, "Найдена запись: " + student.toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }

    private void delBtnClicked() {
        int selected = studentTable.getSelectedRowCount();
        if(selected != 1) {
            JOptionPane.showMessageDialog(this, "Для удаления нужно выбрать 1 строку");
            return;
        }
        selected = studentTable.getSelectedRow();
        students.remove(selected);
        DefaultTableModel dtm = (DefaultTableModel) studentTable.getModel();

        dtm.removeRow(selected);

    }

    private void addBtnClicked() throws IllegalArgumentException {
        String fio = JOptionPane.showInputDialog("Введите фио.");

        if(fio == null){
            return;
        }

        if(fio.equals("")) {
            throw new EmptyStringException();
        }

        String idNumber = JOptionPane.showInputDialog("Введите номерной ID.");
        int idNumberI = 0;

        try {
            idNumberI = Integer.parseInt(idNumber);
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Некорректоное число "+e.getMessage().substring(17));
        }

        String gpa = JOptionPane.showInputDialog("Введите средний балл(GPA).");

        double gpaI = 0;

        try {
            gpaI = Double.parseDouble(gpa);
        }
        catch (NumberFormatException e){
            String message = e.getMessage();
            if (message.equals("empty String")){
                throw new NumberFormatException("Строка пуста, введите значение");
            }
            else {
                throw new NumberFormatException("Некорректоное число "+e.getMessage().substring(17));
            }
        }

        students.add(new Student(fio, idNumberI, gpaI));

        DefaultTableModel dtm = (DefaultTableModel) studentTable.getModel();

        dtm.addRow(new Object[]{fio, idNumber,gpa});
    }
}
