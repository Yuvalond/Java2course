package ru.mirea.ikbo2822.ulyanov.lab23_24;

class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}
