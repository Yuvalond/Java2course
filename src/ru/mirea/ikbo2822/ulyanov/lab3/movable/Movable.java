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
    public String toString() {return "MovablePoint: {x = " + x + " y = " + y + " xSpeed = " + xSpeed + " ySpeed = " + ySpeed + "}";}
    @Override
    public void moveUp(){this.y += this.ySpeed;}
    @Override
    public void moveDown(){this.y -= this.ySpeed;}
    @Override
    public void moveLeft(){this.x -= this.xSpeed;}
    @Override
    public void moveRight(){this.x += this.xSpeed;}
    // Добавил два метода для того что бы можно было получить скорость для проверки в rectangle
    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
}

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed,int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        if (radius > 0){
            this.radius = radius;
        }
        else{
            this.radius = 1;
        }
    }
    public String toString(){return "MovableCircle: {radius: " + this.radius + ", center: " + this.center + "}";}

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        if (!checkSpeeds(topLeft, bottomRight)) {
            throw new IllegalArgumentException("The speeds of the points are different");
        }
    }

    private boolean checkSpeeds(MovablePoint point1, MovablePoint point2) {
        return point1.getxSpeed() == point2.getxSpeed() && point1.getySpeed() == point2.getySpeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle: topLeft { " + topLeft + " } , bottomRight : { " + bottomRight.toString() + " }";
    }
}