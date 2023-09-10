package ru.mirea.ikbo2822.ulyanov.lab4;
import javax.swing.*; //наборы инструментов для построения GUI
import java.awt.*;
import java.awt.event.*;
public class GUIProgram {
    public static class FootballMatch extends JFrame implements ActionListener { //JFrame оно приложения , ActionListener обработка событий кнопок
        private int milanScore = 0;
        private int madridScore = 0;
        private JButton milanButton;
        private JButton madridButton;
        private JLabel resultLabel;
        private JLabel lastScorerLabel;
        private JLabel winnerLabel;

        //КОНСТРУКТОР
        public FootballMatch() {
            setTitle("Football Match");
            setSize(300, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            milanButton = new JButton("AC Milan");
            madridButton = new JButton("Real Madrid");
            resultLabel = new JLabel("Result: 0 X 0");
            lastScorerLabel = new JLabel("Last Scorer: N/A");
            winnerLabel = new JLabel("Winner: DRAW");

            milanButton.addActionListener(this);
            madridButton.addActionListener(this);

            setLayout(new GridLayout(5, 1));
            add(milanButton);
            add(madridButton);
            add(resultLabel);
            add(lastScorerLabel);
            add(winnerLabel);
        }
        // выполнение действий при нажатии на кнопку
        public void actionPerformed(ActionEvent e) {
            //проверяем какую кнопку нажали
            if (e.getSource() == milanButton) {
                milanScore++;
                lastScorerLabel.setText("Last Scorer: AC Milan");
            } else if (e.getSource() == madridButton) {
                madridScore++;
                lastScorerLabel.setText("Last Scorer: Real Madrid");
            }

            resultLabel.setText("Result: " + milanScore + " X " + madridScore);

            if (milanScore > madridScore) {
                winnerLabel.setText("Winner: AC Milan");
            } else if (milanScore < madridScore) {
                winnerLabel.setText("Winner: Real Madrid");
            } else {
                winnerLabel.setText("Winner: DRAW");
            }
        }
    }
}
