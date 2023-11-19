package ru.mirea.ikbo2822.ulyanov.lab20;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private JTextField display;
    protected JButton[] digitButtons;
    protected JButton[] operatorButtons;
    protected JButton equalsButton;
    protected JButton dotButton;
    protected JButton nextDigit;
    protected JButton clearButton;

    public CalculatorView(){
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        JPanel buttonsPanel = new JPanel(new BorderLayout());
        JPanel digitsOperatorsPanel = new JPanel(new GridLayout(4, 4));

        //кнопки цифры
        digitButtons = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            digitButtons[i] = new JButton(Integer.toString(i));
        }

        //кнопки операнды
        operatorButtons = new JButton[]{new JButton("/"), new JButton("*"), new JButton("-"), new JButton("+")};

        //кнопка равно и точка
        equalsButton = new JButton("=");
        dotButton = new JButton(".");

        //расположение
        digitsOperatorsPanel.add(digitButtons[7]);
        digitsOperatorsPanel.add(digitButtons[8]);
        digitsOperatorsPanel.add(digitButtons[9]);
        digitsOperatorsPanel.add(operatorButtons[0]);

        digitsOperatorsPanel.add(digitButtons[4]);
        digitsOperatorsPanel.add(digitButtons[5]);
        digitsOperatorsPanel.add(digitButtons[6]);
        digitsOperatorsPanel.add(operatorButtons[1]);

        digitsOperatorsPanel.add(digitButtons[1]);
        digitsOperatorsPanel.add(digitButtons[2]);
        digitsOperatorsPanel.add(digitButtons[3]);
        digitsOperatorsPanel.add(operatorButtons[2]);

        digitsOperatorsPanel.add(digitButtons[0]);
        digitsOperatorsPanel.add(dotButton);
        digitsOperatorsPanel.add(operatorButtons[3]);
        digitsOperatorsPanel.add(equalsButton);


        JPanel buttonsSouthPanel = new JPanel(new GridLayout(1, 2));
        nextDigit = new JButton("Next digit");
        clearButton = new JButton("C");
        buttonsSouthPanel.add(nextDigit);
        buttonsSouthPanel.add(clearButton);

        buttonsPanel.add(digitsOperatorsPanel, BorderLayout.CENTER);
        buttonsPanel.add(buttonsSouthPanel,BorderLayout.SOUTH);

        add(buttonsPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        display.setPreferredSize(new Dimension(300, 50));
        setSize(400, 500);

    }

    // Метод для получения введенных пользователем значений
    public String getDisplayText() {
        return display.getText();
    }

    public void setDisplayText(String text) {
        display.setText(text);
    }
}
