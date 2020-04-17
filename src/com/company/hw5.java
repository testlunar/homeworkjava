package com.company;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class hw5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println(x);
        System.out.println(x*2);
        System.out.println(x*3);
        System.out.println(x*4);
        System.out.println(x*5);
        System.out.println(x*6);
        System.out.println(x*7);
        System.out.println(x*8);
        System.out.println(x*9);
        System.out.println(x*10);

    }
}
