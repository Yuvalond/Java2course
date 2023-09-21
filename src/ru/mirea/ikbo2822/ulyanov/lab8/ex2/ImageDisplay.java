package ru.mirea.ikbo2822.ulyanov.lab8.ex2;

import javax.swing.*;
import java.awt.*;
public class ImageDisplay extends JFrame {
    // Конструктор класса
    public ImageDisplay(String imagePath) {
        // Устанавливаю заголовок окна
        setTitle("View Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel imageLabel = new JLabel();

        // Загружаю изображение из указанного пути
        ImageIcon imageIcon = new ImageIcon(imagePath);

        imageLabel.setIcon(imageIcon);
        getContentPane().add(imageLabel, BorderLayout.CENTER);

        // Подгоняем размер окна под размер изображения
        pack();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Используй: java ImageViewer <imagePath>");
            System.exit(1);
        }

        // Получаю путь к изображению из аргументов командной строки
        String imagePath = args[0];

        ImageDisplay viewer = new ImageDisplay(imagePath);
        viewer.setVisible(true);
    }
}
// java src/ru/mirea/ikbo2822/ulyanov/lab8/ex2/ImageDisplay.java src/ru/mirea/ikbo2822/ulyanov/lab8/ex2/image.jpg