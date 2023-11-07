package ru.mirea.ikbo2822.ulyanov.lab16.ex6;

public class ThrowsDemo {
    //решение данной проблемы было в прошлом задании
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        }
        catch (NullPointerException e) {
            return "Caught exception: " + e;
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        demo.printMessage("Right Value");
        demo.printMessage(null);
    }

}
