package com.company;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String x = s.readLine();; //читаем строку с клавиатуры
        System.out.println("Число в бинарном формате: "+x);
        int Num = Integer.parseInt(x, 2);
        System.out.println("Число в десятичном формате "+Num);

    }


}

