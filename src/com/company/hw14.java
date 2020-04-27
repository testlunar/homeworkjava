package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class hw14 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int s1 = Integer.parseInt(s);
        double s2 = (double) s1;
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}