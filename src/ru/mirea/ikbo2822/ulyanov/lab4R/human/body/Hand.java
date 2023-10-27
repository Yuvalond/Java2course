package ru.mirea.ikbo2822.ulyanov.lab4R.human.body;

public class Hand {
    private int fingers;
    private int flexibility;

    public Hand(int fingers, int flexibility) {
        this.fingers = fingers;
        this.flexibility = flexibility;
    }

    public int getFingers() {
        return fingers;
    }

    public int getFlexibility() {return flexibility;}
}
