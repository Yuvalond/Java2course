package ru.mirea.ikbo2822.ulyanov.lab3.movable;

public interface Movable {
   public abstract void moveUp();
   public abstract void moveDown();
   public abstract void moveLeft();
   public abstract void moveRight();
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {return "MovablePoint: x = " + x + " y = " + y + " xSpeed = " + xSpeed + "ySpeed = " + ySpeed;}
    @Override
    public void moveUp(){this.y += 1;}
    @Override
    public void moveDown(){this.y -= 1;}
    @Override
    public void moveLeft(){this.x -= 1;}
    @Override
    public void moveRight(){this.x += 1;}

    //class MovableCircle implements Movable{

    //}
}