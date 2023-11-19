package ru.mirea.ikbo2822.ulyanov.lab22.ex2;

//абстрактная фабрика
public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
