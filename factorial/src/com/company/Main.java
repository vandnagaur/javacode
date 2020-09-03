package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number you want factorial of:");
        int number = s.nextInt();
        int fact =1;
        for ( int i = 1; i <= number; i++){
           fact = fact * i;
        }
        System.out.println("factorial is" +fact);
    }
}
