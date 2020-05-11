package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class hw15 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> massive = new ArrayList<Integer>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int s1= Integer.parseInt(s);
            massive.add(s1);
        }
        int [] arr= getIntArraymassive(massive);
        System.out.println("Изначальный массив: " +Arrays.toString(arr));
        for (int i = arr.length- 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(arr));
    }
    private static int[] getIntArraymassive(ArrayList<Integer> massive) {
        int [] result= new int[massive.size()];
        Iterator iterator= massive.iterator();
        for (int i=0; i<result.length; i++){
            result[i]=(int)iterator.next();
        }
        return result;
    }
}

