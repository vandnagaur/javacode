package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        System.out.println("a is =" +a);
        System.out.println("b is =" +b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("swapped value of a is "+a);
        System.out.println("swapped value of b is "+b);
    }
}
