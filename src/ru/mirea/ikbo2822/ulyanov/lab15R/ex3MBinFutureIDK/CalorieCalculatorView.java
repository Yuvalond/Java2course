package ru.mirea.ikbo2822.ulyanov.lab15R.ex3MBinFutureIDK;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class CalorieCalculatorView {
    private JFrame frame;
    private JTextField nameField;
    private JSpinner proteinSpinner;
    private JSpinner fatSpinner;
    private JSpinner carbohydratesSpinner;
    private JButton calculateButton;
    private JLabel resultLabel;
    private JButton addButton; // Добавленная кнопка
    private JList<String> itemList; // Список для отображения введенных данных
    private DefaultListModel<String> listModel; // Модель списка

    public CalorieCalculatorView() {
        frame = new JFrame("Калькулятор каллорий");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        panel.add(new JLabel("Имя:"));
        nameField = new JTextField();
        panel.add(nameField);

        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(2);

        SpinnerNumberModel proteinModel = new SpinnerNumberModel(0.0, 0.0, 1000.0, 0.1);
        proteinSpinner = new JSpinner(proteinModel);
        panel.add(new JLabel("Белки (г):"));
        panel.add(proteinSpinner);

        SpinnerNumberModel fatModel = new SpinnerNumberModel(0.0, 0.0, 1000.0, 0.1);
        fatSpinner = new JSpinner(fatModel);
        panel.add(new JLabel("Жиры (г):"));
        panel.add(fatSpinner);

        SpinnerNumberModel carbohydratesModel = new SpinnerNumberModel(0.0, 0.0, 1000.0, 0.1);
        carbohydratesSpinner = new JSpinner(carbohydratesModel);
        panel.add(new JLabel("Углеводы (g):"));
        panel.add(carbohydratesSpinner);

        calculateButton = new JButton("Рассчитать калории");
        panel.add(calculateButton);

        resultLabel = new JLabel("Калории: ");
        panel.add(resultLabel);

        addButton = new JButton("Add to List"); // Добавленная кнопка
        panel.add(addButton); // Добавленная кнопка

        listModel = new DefaultListModel<>(); // Инициализация модели списка
        itemList = new JList<>(listModel); // Инициализация списка

        panel.add(new JLabel("Entered Items:")); // Добавленная метка
        panel.add(new JScrollPane(itemList)); // Добавленный список

        frame.add(panel);
    }

    public String getName() {
        return nameField.getText();
    }

    public double getProtein() {
        return (double) proteinSpinner.getValue();
    }

    public double getFat() {
        return (double) fatSpinner.getValue();
    }

    public double getCarbohydrates() {
        return (double) carbohydratesSpinner.getValue();
    }

    public void setResult(double calories) {
        resultLabel.setText("Calories: " + calories);
    }

    public void addCalculateButtonListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
    public void AddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void display() {
        frame.setVisible(true);
    }

    public void addItemToList(String item) {
        listModel.addElement(item);
    }

    public String getSelectedListItem() {
        return itemList.getSelectedValue();
    }
    public String getSelectedItem() {
        return itemList.getSelectedValue();
    }
}