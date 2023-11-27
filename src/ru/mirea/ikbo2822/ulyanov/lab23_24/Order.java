package ru.mirea.ikbo2822.ulyanov.lab23_24;

interface Order {
    //добавление позиции в заказ
    boolean add(Item item);
    //удаление позиции из закакза по его названию
    boolean remove(String itemName);
    //Удаляет все позиции из заказа пое его названию
    void removeAll(String itemName);
    //возвращает общее число позиций заказа в заказе
    int totalOrderQuantity();
    //возвращает массив позиций заказа.
    Item[] getOrderItems();

    //возвращает общую стоимость
    //заказа
    double orderTotalCost();
    //возвращает число заказанных блюд или напитков
    int itemQuantity(String itemName);
    //Возвращает массив позиций заказа, отсортированный по
    //убыванию цены.
    Item[] sortedOrderByPriceDesc();
}
