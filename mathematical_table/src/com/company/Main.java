package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter number for table:");
        int number = s.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
