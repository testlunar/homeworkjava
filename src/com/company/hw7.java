package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hw7 {
    public static void main(String[] args) throws InterruptedException{

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);//напишите тут ваш код


        }

        System.out.println("Бум!");
    }
}
