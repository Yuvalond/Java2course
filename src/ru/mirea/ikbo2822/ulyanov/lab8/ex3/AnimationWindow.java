package ru.mirea.ikbo2822.ulyanov.lab8.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationWindow extends JFrame {
    private JLabel animationLabel;
    private Timer timer;
    private int currentFrame = 1;
    private int totalFrames = 24;
    private int frameDelay = 100;

    public AnimationWindow() {
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        animationLabel = new JLabel();
        add(animationLabel);

        timer = new Timer(frameDelay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFrame();
            }
        });
        timer.start();
    }

    private void updateFrame() {
        ImageIcon imageIcon = new ImageIcon("src/ru/mirea/ikbo2822/ulyanov/lab8/ex3/frames/f" + currentFrame + ".jpg");

        int imageWidth = imageIcon.getIconWidth();
        int imageHeight = imageIcon.getIconHeight();
        setSize(imageWidth, imageHeight);

        animationLabel.setIcon(imageIcon);

        currentFrame++;
        if (currentFrame > totalFrames) {
            currentFrame = 1;
        }
    }

    public static void main(String[] args) {
        AnimationWindow frame = new AnimationWindow();
        frame.setVisible(true);
    }
}
/*
 cd src/ru/mirea/ikbo2822/ulyanov/lab8/ex3/
 java AnimationWindow.java frames 24 50
*/
