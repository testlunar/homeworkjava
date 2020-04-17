package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hw7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int x = 100;
        int y = 55;
        int z = 3;
        if (number == x || number ==y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else System.out.println("Такой константы нет!");
    }
}
