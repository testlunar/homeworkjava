package com.company;

import java.io.*;

public class hw17 {
    public static void main(String[] args) throws Exception {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");
        try (FileWriter fw = new FileWriter("text.txt")) {
            do {
                System.out.print(": ");
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}


