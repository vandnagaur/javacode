package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 15;

        if (a > b && a > c){

            System.out.println(" a is largest");
        }
        else if (b > a && b > c){

            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
