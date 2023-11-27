package ru.mirea.ikbo2822.ulyanov.lab23_24;


final class RestaurantOrder implements Order{
    private final int size;
    private final Item[] Items;
    private int nextIndex;

    RestaurantOrder(int size) {
        this.size = size;
        this.Items = new Item[size];
        this.nextIndex = 0;
    }

    @Override
    public boolean add(Item dish) {
        if (nextIndex < size) {
            Items[nextIndex++] = dish;
            return true;
        }
        return false;
    }
    @Override
    public boolean remove(String dishName) {
        for (int i = 0; i < nextIndex; i++) {
            if (Items[i].getName().equals(dishName)) {
                for (int j = i; j < nextIndex - 1; j++) {
                    Items[j] = Items[j + 1];
                }
                nextIndex--;
                return true;
            }
        }
        return false;
    }
    @Override
    public void removeAll(String dishName) {
        int count = 0;
        for (int i = 0; i < nextIndex; i++) {
            if (Items[i].getName().equals(dishName)) {
                for (int j = i; j < nextIndex - 1; j++) {
                    Items[j] = Items[j + 1];
                }
                nextIndex--;
                count++;
            }
        }
    }
    @Override
    public int totalOrderQuantity() {
        return this.nextIndex;
    }
    @Override
    public int itemQuantity(String dishName) {
        int count = 0;
        for (int i = 0; i < nextIndex; i++) {
            if (Items[i].getName().equals(dishName)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Item[] getOrderItems() {
        return Items.clone();
    }

    public double orderTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < nextIndex; i++) {
            totalCost += Items[i].getCost();
        }
        return totalCost;
    }

    public String[] dishesNames() {
        String[] names = new String[nextIndex];
        for (int i = 0; i < nextIndex; i++) {
            names[i] = Items[i].getName();
        }
        return names;
    }

    @Override
    public Item[] sortedOrderByPriceDesc() {
        Item[] sortedDishes = Items.clone();
        for (int i = 0; i < nextIndex - 1; i++) {
            for (int j = 0; j < nextIndex - i - 1; j++) {
                if (sortedDishes[j].getCost() < sortedDishes[j + 1].getCost()) {
                    Item temp = sortedDishes[j];
                    sortedDishes[j] = sortedDishes[j + 1];
                    sortedDishes[j + 1] = temp;
                }
            }
        }
        return sortedDishes;
    }
}