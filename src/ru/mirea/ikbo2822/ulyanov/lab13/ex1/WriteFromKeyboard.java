package ru.mirea.ikbo2822.ulyanov.lab13.ex1;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;
public class WriteFromKeyboard {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter("example.txt",false)){
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            do {
                String text = scanner.nextLine();
                if (scanner.equals("exit")){
                    flag = false;
                    break;
                }
                else{
                    writer.write(text);
                }
            }
            while(flag);
            scanner.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
