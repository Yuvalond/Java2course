package ru.mirea.ikbo2822.ulyanov.lab17.ex1;
//Клиент совершает покупку онлайн. При оформлении заказа у
//пользователя запрашивается фио и номер ИНН. В программе проверяется,
//действителен ли номер ИНН для такого клиента. Исключение будет выдано в
//том случае, если введен недействительный ИНН

//создал исключение
class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

public class OnlinePurchase {
    public static boolean isValidINN(String inn) {
        //создавать проверку имя = ИНН не стал
        return inn.matches("\\d{10}"); // 10 цифр
    }
    public static void placeOrder(String fullName, String inn) {
        try {
            if (!isValidINN(inn)) {
                throw new InvalidINNException("Недействительный ИНН!");
            }
            System.out.println("Заказ успешно оформлен для " + fullName);
        }
        catch (InvalidINNException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        placeOrder("Иванов Иван Иванович", "1234567890");
        placeOrder("Иванов Иван Иванович", "123456789");
    }
}
