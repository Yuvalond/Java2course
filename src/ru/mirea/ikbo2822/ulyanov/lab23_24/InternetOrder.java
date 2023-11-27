package ru.mirea.ikbo2822.ulyanov.lab23_24;
class InternetOrder implements Order{
    private static class Node {
        Item item;
        Node next;
        Node prev;

        Node(Item item, Node prev, Node next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    InternetOrder() {
        head = new Node(null, null, null);
        head.prev = head;
        head.next = head;
        size = 0;
    }

    InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            add(item);
        }
    }
    @Override
    public boolean add(Item item) {
        Node newNode = new Node(item, head.prev, head);
        head.prev.next = newNode;
        head.prev = newNode;
        size++;
        return true;
    }
    @Override
    public boolean remove(String itemName) {
        Node current = head.prev;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            }
            current = current.prev;
        }
        return false;
    }
    @Override
    public void removeAll(String itemName) {
        int count = 0;
        Node current = head.prev;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                count++;
            }
            current = current.prev;
        }
    }
    @Override
    public int totalOrderQuantity() {
        return size;
    }
    @Override
    public Item[] getOrderItems() {
        Item[] items = new Item[size];
        Node current = head.next;
        int index = 0;
        while (current != head) {
            items[index++] = current.item;
            current = current.next;
        }
        return items;
    }
    @Override
    public double orderTotalCost() {
        double totalCost = 0.0;
        Node current = head.next;
        while (current != head) {
            totalCost += current.item.getCost();
            current = current.next;
        }
        return totalCost;
    }
    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public Item[] sortedOrderByPriceDesc() {
        Item[] items = getOrderItems();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (items[j].getCost() < items[j + 1].getCost()) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }
}
