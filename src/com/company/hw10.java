package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hw10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите размерность матрицы (столбец и строка):");
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(s.readLine());
        int x = Integer.parseInt(s.readLine());
        int massive[][] = new int[y][x];
        int i, j = 0;
        for (i = 0; i < y; i++) {
            for (j = 0; j < x; j++) {
                System.out.println("Введите число в массив:");
                int number = Integer.parseInt(s.readLine());
                massive[i][j] = number;
            }
        }
        System.out.println("Первая строчка массива, умноженная на 3:");
        for (j = 0; j < x; j++) {
                       System.out.print(massive[0][j]*3+" ");
        }
    }
}
