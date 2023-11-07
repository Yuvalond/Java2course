package ru.mirea.ikbo2822.ulyanov.lab16.ex5;

public class ThrowsDemo {
    // является подходяищим и я не знаю почему может им не являтся
    // так как оно не может там быть неправильным , кроме как null
    public String getDetails2(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e) {
            return "Caught exception: " + e;
        }
        return "data for" + key;
        // do something with the key
    }

    public void getDetails1(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        // do something with the key
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        //demo.getDetails1(null);
        String getD = demo.getDetails2(null);
        System.out.println(getD);
    }

}
