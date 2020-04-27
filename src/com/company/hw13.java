package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class hw13 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int l1=s1.length();
        int l2=s2.length();
        if (l1>l2){
            System.out.println(s1);}
            else if (l1<l2){
                System.out.println(s2);}
                else if (l1==l2){
                    System.out.printf("Длины строк равны");
                }
            }
        }