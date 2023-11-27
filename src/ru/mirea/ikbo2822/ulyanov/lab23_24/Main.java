package ru.mirea.ikbo2822.ulyanov.lab23_24;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание напитков и блюд
            Item cola = new Drink(2.99, "Cola", "Refreshing drink");
            Item sprite = new Drink(4.99, "Sprite", "Refreshing drink");
            Item pizza = new Dish(10.99, "Peperoni", "Tasty pizza");
            Item pizza2 = new Dish(10.99, "4 cheese", "Tasty pizza");

            // Создание заказов
            RestaurantOrder restaurantOrder = new RestaurantOrder(10);
            InternetOrder internetOrder = new InternetOrder();

            // Создание менеджера заказов
            OrderManager orderManager = new OrderManager();

            // Добавление заказов к столикам и адресам
            orderManager.add(restaurantOrder, 1);
            orderManager.add("123 Main St", internetOrder);

            // ИСКЛЮЧЕНИЯ

            // Попытка добавления заказа на уже занятый столик
            //orderManager.add(restaurantOrder, 1);
            // Попытка добавления заказа по уже занятому адресу
            //orderManager.add("123 Main St", internetOrder);
            // Попытка добавления позиции к несуществующему столику
            //orderManager.addPositionToOrder(10, cola);
            // Попытка добавления позиции к несуществующему адресу
            //orderManager.addPositionToOrder("456 Oak St", pizza);
            // Попытка создать напиток с неправильной стоимостью
            //Item wrongCostDrink = new Drink(-2.0, "Wrong Cost Drink", "Invalid cost");
            // Попытка создать блюдо с неправильным описанием
            //Item wrongDescriptionDish = new Dish(15.0, "Pizza", "");


            // Добавление позиций к заказам
            orderManager.addPositionToOrder(1, cola);
            orderManager.addPositionToOrder(1, pizza);
            orderManager.addPositionToOrder("123 Main St", sprite);
            orderManager.addPositionToOrder("123 Main St", pizza2);

            // Вывод информации о заказах и их стоимости
            System.out.println("Restaurant Order - Total cost: " + restaurantOrder.orderTotalCost());
            System.out.println("Internet Order - Total cost: " + internetOrder.orderTotalCost());

            // Получение заказов по столикам и адресам
            RestaurantOrder retrievedRestaurantOrder = (RestaurantOrder) orderManager.getOrder(1);
            InternetOrder retrievedInternetOrder = (InternetOrder) orderManager.getOrder("123 Main St");

            // Удаление позиций из заказов
            retrievedRestaurantOrder.remove("Pizza");
            retrievedInternetOrder.removeAll("Cola");

            // Получение общего количества позиций в заказах
            System.out.println("Total order quantity for Restaurant Order: " + retrievedRestaurantOrder.totalOrderQuantity());
            System.out.println("Total order quantity for Internet Order: " + retrievedInternetOrder.totalOrderQuantity());

            // Получение массива отсортированных позиций по убыванию цены
            Item[] sortedItems = retrievedInternetOrder.sortedOrderByPriceDesc();

            System.out.println("Sorted items in Internet Order by price:");
            for (Item item : sortedItems) {
                if (item != null) {
                    System.out.println(item.getName() + " - " + item.getCost() + " - " + item.getDescription());
                }
            }

            // Удаление заказов по столикам и адресам
            orderManager.removeOrder(1);
            orderManager.removeOrder("123 Main St");

            // Получение массива имеющихся на данный момент интернет-заказов
            Order[] internetOrders = orderManager.getInternetOrders();
            System.out.println("Internet Orders: " + internetOrders.length);

        } catch (IllegalArgumentException | OrderAlreadyAddedException | IllegalTableNumber e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


