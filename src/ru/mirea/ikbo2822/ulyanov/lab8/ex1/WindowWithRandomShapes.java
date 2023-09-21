package ru.mirea.ikbo2822.ulyanov.lab8.ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class WindowWithRandomShapes extends JPanel {
    private int WINDOW_WIDTH = 800;
    private int WINDOW_HEIGHT = 600;
    private int NUM_SHAPES = 20;

    private Shape[] shapes;

    public WindowWithRandomShapes() {
        shapes = new Shape[NUM_SHAPES];
        Random rand = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = rand.nextInt(WINDOW_WIDTH);
            int y = rand.nextInt(WINDOW_HEIGHT);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            int shapeType = rand.nextInt(2); // 0 для круга, 1 для прямоугольника
            int size = rand.nextInt(50) + 20; // рандом между 20 и 70

            if (shapeType == 0) {
                shapes[i] = new Circle(color, x, y, size);
            } else {
                int width = rand.nextInt(50) + 20;
                int height = rand.nextInt(50) + 20;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }
    }


    //запускается внутри Jpanel для перерисовки
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Рандомные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new WindowWithRandomShapes());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
