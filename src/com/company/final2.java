package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


    public class final2 {
        public static void main(String[] args) throws Exception {
            System.out.println("Введите размер массива: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(reader.readLine());
            int[] arr= new int [x];
            System.out.println("Введите "+ x + " чисел в массив:");
            for (int i=0; i<x;i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            int temp, j;
            for(int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    j = i;
                    while (j > 0 && temp < arr[j - 1]) {
                        arr[j] = arr[j - 1];
                        j--;
                    }
                    arr[j] = temp;
                }
            }
            System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        }
    }



