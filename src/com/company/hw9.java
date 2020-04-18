package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hw9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Сколько ячеек будет в вашем массиве?");
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(s.readLine());
        int massive[] = new int[size];
        int i = 0;
        for (i = 0; i < size; i++) {
            System.out.println("Введите " + i + " число в массив:");
            BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(num.readLine());
            massive[i] = number;
        }

        System.out.println("Ваш массив выглядит так:");
        for (i = 0; i < size; i++) {
            System.out.println(massive[i]);
        }


    }
}
