package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class hw12 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();
               String[] sParts = S.split(" ");
        for (int i=0; i<sParts.length;i++){
        System.out.print(sParts[i]);
        }
    }
}