package ru.mirea.ikbo2822.ulyanov.lab6R.furniture;

// Абстрактный класс, описывающий мебель
abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void displayInfo();
}

//Стул
class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName() + ", Цена: " + getPrice());
    }
}

//Стол
class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName() + ", Цена: " + getPrice());
    }
}

// Класс, моделирующий магазин мебели
class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture furniture, int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = furniture;
        }
    }

    public void displayInventory() {
        for (Furniture item : inventory) {
            int i = 1;
            if (item != null) {
                item.displayInfo();
            }
        }
    }
    public void deleteFurniture(int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = null;
        }
        else{
            System.out.println("Не удалось удалить объект так как индекс неправильный");
        }
    }
}
