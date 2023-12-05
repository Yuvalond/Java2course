package ru.mirea.ikbo2822.ulyanov.lab23_24;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание напитков и блюд
            Item cola = new Drink(2.99, "Кола", "Без сахара");
            Item sprite = new Drink(4.99, "Спрайт", "Освежающий напиток");
            Item pizza = new Dish(10.99, "Пепперони", "Вкусная пицца");
            Item pizza2 = new Dish(10.99, "4 сыра", "Вкусная пицца");

            // Создание заказов
            RestaurantOrder restaurantOrder = new RestaurantOrder(10);
            InternetOrder internetOrder = new InternetOrder();

            // Создание менеджера заказов
            OrderManager orderManager = new OrderManager();

            // Добавление заказов к столикам и адресам
            orderManager.add(restaurantOrder, 1); //добавление к первому столику
            orderManager.add("123 Ад ре с", internetOrder); //добавление к адресу

            ///* ИСКЛЮЧЕНИЯ *///

            // Попытка добавления заказа на уже занятый столик
            //orderManager.add(restaurantOrder, 1);

            // Попытка добавления заказа по уже занятому адресу
            //orderManager.add("123 Ад ре с", internetOrder);

            // Попытка добавления позиции к несуществующему столику
            //orderManager.addPositionToOrder(10, cola);

            // Попытка добавления позиции к несуществующему адресу
            //orderManager.addPositionToOrder("456 Oak St", pizza);

            // Попытка создать напиток с неправильной стоимостью
            //Item wrongCostDrink = new Drink(-2.0, "Wrong Cost Drink", "Invalid cost");

            // Попытка создать блюдо с неправильным описанием
            //Item wrongDescriptionDish = new Dish(15.0, "Pizza", "");


            // Добавление позиций к заказам
            orderManager.addPositionToOrder(1, cola); //добавление позиции по столику
            orderManager.addPositionToOrder(1, pizza);
            orderManager.addPositionToOrder("123 Ад ре с", sprite); //добавление позиции по адресу
            orderManager.addPositionToOrder("123 Ад ре с", pizza2);

            // Вывод информации о заказах и их стоимости
            System.out.println("Заказ в ресторане - Общая стоимость: " + restaurantOrder.orderTotalCost());
            System.out.println("Интернет заказ - Общая стоимость: " + internetOrder.orderTotalCost());

            // Получение заказов по столикам и адресам
            RestaurantOrder retrievedRestaurantOrder = (RestaurantOrder) orderManager.getOrder(1);
            InternetOrder retrievedInternetOrder = (InternetOrder) orderManager.getOrder("123 Ад ре с");

            // Удаление позиций из заказов
            retrievedRestaurantOrder.remove("Пепперони");
            retrievedInternetOrder.removeAll("Кола");

            // Получение общего количества позиций в заказах
            System.out.println("Количество ресторанных заказов: " + retrievedRestaurantOrder.totalOrderQuantity());
            System.out.println("Количество интернет заказов: " + retrievedInternetOrder.totalOrderQuantity());

            // Получение массива отсортированных позиций по убыванию цены
            Item[] sortedItems = retrievedInternetOrder.sortedOrderByPriceDesc();

            System.out.println("Отсортированные позиции по цене в интернет заказе:");
            for (Item item : sortedItems) {
                if (item != null) {
                    System.out.println(item.getName() + " - " + item.getCost() + " - " + item.getDescription());
                }
            }

            // Получение массива отсортированных позиций по убыванию цены
            Item[] sortedItems2 = retrievedRestaurantOrder.sortedOrderByPriceDesc();

            System.out.println("Отсортированные позиции по цене в ресторанном заказе:");
            for (Item item : sortedItems2) {
                if (item != null) {
                    System.out.println(item.getName() + " - " + item.getCost() + " - " + item.getDescription());
                }
            }

            // Удаление заказов по столикам и адресам
            orderManager.removeOrder(1); //столик
            orderManager.removeOrder("123 Ад ре с"); //адрес

            // Получение массива имеющихся на данный момент интернет-заказов
            Order[] internetOrders = orderManager.getInternetOrders();
            System.out.println("Интернет заказ: " + internetOrders.length);

        } catch (IllegalArgumentException | OrderAlreadyAddedException | IllegalTableNumber e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


