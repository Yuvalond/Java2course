package ru.mirea.ikbo2822.ulyanov.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Класс FootballMatch расширяет JFrame и реализует интерфейс MouseListener
class FootballMatch extends JFrame implements MouseListener {
    // Переменные для хранения счета Милана и Мадрида
    private int milanScore = 0;
    private int madridScore = 0;

    // Метки для отображения результата, последнего забившего и победителя
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    // Конструктор класса
    public FootballMatch() {
        // Устанавливаем заголовок окна
        setTitle("Football Match");

        // Устанавливаем размер окна
        setSize(300, 200);

        // Закрываем приложение при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем кнопки для Милана и Мадрида
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        // Инициализируем метки
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        // Добавляем этот класс в качестве слушателя к кнопкам
        milanButton.addMouseListener(this);
        madridButton.addMouseListener(this);

        // Устанавливаем GridLayout для размещения компонентов в окне
        setLayout(new GridLayout(5, 1));

        // Добавляем компоненты в окно
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    // Обработчик события клика мыши
    public void mouseClicked(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("AC Milan")) {
            milanScore++;
        } else if (button.getText().equals("Real Madrid")) {
            madridScore++;
        }

        // После изменения счета, обновляем label
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + (milanScore > madridScore ? "AC Milan" : "Real Madrid"));
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    // Методы интерфейса, которые не используются но должны быть
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}


    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
        match.setVisible(true);
    }
}
//26 варинат 9 10 11