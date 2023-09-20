package ru.mirea.ikbo2822.ulyanov.lab5R.movable;



public class TestMovable {
    public static void main(String[] args) {
        MovableCircle movable_circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println(movable_circle);
        movable_circle.moveUp();
        movable_circle.moveRight();
        System.out.println(movable_circle);
        movable_circle.moveDown();
        movable_circle.moveLeft();
        System.out.println(movable_circle);

        MovableRectangle rectangle = new MovableRectangle(2,1,2,1,1,2);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}