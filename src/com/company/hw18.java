package com.company;

import java.io.*;

public class hw18 {
    public static void main(String[] args) throws Exception {
        String s;
        int linesCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\diana\\Desktop\\text2.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                linesCount++;

            }
            System.out.println("Koличecтвo cтpok в фaйлe: " + linesCount);
        }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите новые " +linesCount+" строки");
            try (FileWriter fw = new FileWriter("C:\\Users\\diana\\Desktop\\text2.txt")) {
                do {
                    System.out.print(": ");
                    s = br.readLine();
                    if (s.compareTo("stop") == 0) break;
                    s = s + "\r\n";
                    fw.write(s);
                    linesCount--;
                } while (linesCount > 0);
            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        }
    }




