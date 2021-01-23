package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("c:\\123\\123.txt");
        Scanner scanner = new Scanner(file);

        //throw new IndexOutOfBoundsException("index=3");
        int[] x = new int[5];

        try {
            int a = 100;
            int b = 0;

           // System.out.println(a / b);
         //   x[100] = 5;
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.hashCode());
        } catch(ArithmeticException e) {
            System.out.println(e.hashCode());
        } finally {
            // закрытие файла
            System.out.println("Всегда!!!");
        }
        System.out.println("После деления! После try!");


        try {
            while(true) {
                System.out.println("123");
            }
        } catch(Exception e) {
            System.out.println("Bu!");
        }
        System.out.println("After!");


        try {
            toDo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toDo() throws Exception {
        // код который выбрасывает исключ.
    }
}


