package ru.mirea.ikbo2822.ulyanov.lab4.circle;

public class Circle {
    private double radius;
    private double diametr;
    public Circle(double radius){
        this.radius = radius;
        this.diametr = radius*2;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double calculatePeriemetr(){
        return 2*Math.PI*this.radius;
    }
    public String toString() {
        return "Круг радиус:" + this.radius + ", diameter:" + this.diametr;
    }
}
