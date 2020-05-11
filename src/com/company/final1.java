package com.company;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class final1 {

    public static void main(String[] args) throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String X = s.readLine();
        int x= Integer.parseInt(X);
        System.out.println("Число в бинарном формате: " + x);
        int[] massive = new int[X.length()];
        for (int i = X.length()-1; i >= 0; i--) {
            int y = x%10;
            massive[i] = y;
            x = x / 10;
        }
        int number=0;
        int step=1;
        for (int i=massive.length-1; i>=0; i--){
            number+=massive[i]*(step);
            step=step*2;
        }
        System.out.println("Число в двоичном формате: "+ number);
    }
}




