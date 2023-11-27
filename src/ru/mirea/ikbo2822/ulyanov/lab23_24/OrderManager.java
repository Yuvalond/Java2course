package ru.mirea.ikbo2822.ulyanov.lab23_24;

import java.util.HashMap;

// Класс OrderManager для управления заказами
final class OrderManager {
    private HashMap<Integer, Order> orders;
    private HashMap<String, Order> addressOrders;

    OrderManager() {
        orders = new HashMap<>();
        addressOrders = new HashMap<>();
    }

    void add(Order order, int tableNumber) throws OrderAlreadyAddedException {
        if (orders.containsKey(tableNumber)) {
            throw new OrderAlreadyAddedException("Order is already added to the table");
        }
        orders.put(tableNumber, order);
    }

    Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }

    void removeOrder(int tableNumber) {
        orders.remove(tableNumber);
    }

    void add(String address, Order order) throws OrderAlreadyAddedException {
        if (addressOrders.containsKey(address)) {
            throw new OrderAlreadyAddedException("Order is already added to the address");
        }
        addressOrders.put(address, order);
    }

    Order getOrder(String address) {
        return addressOrders.get(address);
    }

    void removeOrder(String address) {
        addressOrders.remove(address);
    }

    void addPositionToOrder(int tableNumber, Item item) {
        if (!orders.containsKey(tableNumber)) {
            throw new IllegalTableNumber("Table number does not exist");
        }
        Order order = orders.get(tableNumber);
        order.add(item);
    }

    void addPositionToOrder(String address, Item item) {
        if (!addressOrders.containsKey(address)) {
            throw new IllegalTableNumber("Address does not exist");
        }
        Order order = addressOrders.get(address);
        order.add(item);
    }

    Order[] getInternetOrders() {
        return addressOrders.values().toArray(new Order[0]);
    }

    double getTotalInternetOrdersCost() {
        double totalCost = 0.0;
        for (Order order : addressOrders.values()) {
            totalCost += order.orderTotalCost();
        }
        return totalCost;
    }

    int getTotalOrderedItems(String itemName) {
        int count = 0;
        for (Order order : addressOrders.values()) {
            count += order.itemQuantity(itemName);
        }
        return count;
    }
}
