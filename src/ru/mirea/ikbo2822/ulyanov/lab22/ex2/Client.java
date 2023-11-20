package ru.mirea.ikbo2822.ulyanov.lab22.ex2;

//Клиент, использующий стул
public class Client {
    private Chair chair;
    public void setChair(Chair chair){
        this.chair = chair;
    }
    public void sit(){
        if(chair != null){
            chair.sit();
        }
        else{
            System.out.println("Стул не выбран");
        }
    }
}

