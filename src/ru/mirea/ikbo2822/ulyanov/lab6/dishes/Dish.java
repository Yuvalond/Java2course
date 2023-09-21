package ru.mirea.ikbo2822.ulyanov.lab6.dishes;

abstract class Dish {
    private String material;
    private int size;

    public Dish(String material, int size) {
        this.material = material;
        this.size = size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public abstract void use(); // абстрактный метод , например использование
    public String toString(){
        return "Посуда: { материал: " + material + ", размер: " + size + " }";
    }
}

// Тарелка
class Plate extends Dish {
    private int depth;

    public Plate(String material, int size, int depth) {
        super(material, size);
        this.depth = depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    public int getDepth() {
        return depth;
    }

    @Override
    public void use() {
        System.out.println("Используется тарелка" );
    }
    @Override
    public String toString(){
        return "Тарелка: {"+ super.toString() + "глубина: " + depth + " }";
    }
}

//Кружка
class Cup extends Dish {
    private boolean handle;

    public Cup(String material, int size, boolean handle) {
        super(material, size);
        this.handle = handle;
    }

    public boolean getHandle() {
        return handle;
    }
    public boolean setHandle(boolean handle){
        return this.handle = handle;
    }

    @Override
    public void use() {
        System.out.println("Используется кружка");
    }
    @Override
    public String toString(){
        return "Тарелка: {"+ super.toString() + "ручка: " + handle + " }";
    }
}
