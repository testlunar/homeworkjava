package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class final3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите текущий курс доллара к рублю:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double s = Double.parseDouble(reader.readLine());
        System.out.println("Введите сумму в рублях:");
        int sum = Integer.parseInt(reader.readLine());
        double result = (double)sum/s;
        System.out.println("Результат: "+ new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).floatValue());
    }
}


