package ru.mirea.ikbo2822.ulyanov.lab4.human;
import ru.mirea.ikbo2822.ulyanov.lab4.human.body.*;
public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head(2, 1, 1);
        Leg leftLeg = new Leg(80, 100);
        Leg rightLeg = new Leg(80, 100);
        Hand leftHand = new Hand(5, 90);
        Hand rightHand = new Hand(5, 90);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Глаза: " + human.getHead().getEyes());
        System.out.println("Нос: " + human.getHead().getNose());
        System.out.println("Рот: " + human.getHead().getMouth());
        System.out.println("Длина левой ноги: " + human.getLeftLeg().getLength() + " см");
        System.out.println("Сила правой ноги: " + human.getRightLeg().getStrength() + " Н");
        System.out.println("Пальцы левой руки: " + human.getLeftHand().getFingers());
        System.out.println("Гибкость правой руки: " + human.getRightHand().getFlexibility() + " Градусов");

    }
}

