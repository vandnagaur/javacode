package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any number");
        int a = s.nextInt();
        System.out.println("Enter another number");
        int b = s.nextInt();
        System.out.println("Enter symbol to be checked(+,-,*,/)");
        String sym = s.next();
        int result;

        switch(sym){

            case "+":
                result = a+b;
                System.out.println("addition is:" +result);
                break;

            case "-":
                result = a-b;
                System.out.println("subtraction is:" +result);
                break;

            case "*":
                result = a*b;
                System.out.println("multiplication is:" +result);
                break;

            case "/":
                result = a/b;
                System.out.println("division is:" +result);
                break;

            default:
                System.out.println("please select correct symbol");
                break;
        }
    }
}
