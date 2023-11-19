package ru.mirea.ikbo2822.ulyanov.lab22.ex2;

public class Main {
    public static void main(String[] args){
        //Создаем фабрику
        AbstractChairFactory chairFactory = new ChairFactory();

        //создаем продукты фабрики с помощью нее
        VictorianChair victorianChair = chairFactory.createVictorianChair(140);
        MagicChair magicChair = chairFactory.createMagicChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();

        //создаю клиента
        Client client = new Client();

        //тест методов
        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        client.setChair(functionalChair);
        client.sit();
        System.out.println(functionalChair.sum(10,10));
    }
}
