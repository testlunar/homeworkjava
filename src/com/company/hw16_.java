package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class hw16_ {
    public static void main(String[] args) throws Exception {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\diana\\Desktop\\bufferedreader.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
