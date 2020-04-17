package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hw6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Integer.parseInt(reader.readLine());
        double y = Integer.parseInt(reader.readLine());
        double z = Integer.parseInt(reader.readLine());
        double avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел: " + avg);
               int avg2 =   (int)(avg/2);
        System.out.println(avg2);
        if (avg2 > 3) {
           System.out.println("Программа выполнена корректно ");}


    }
}
