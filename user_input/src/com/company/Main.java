package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = s.next();
        System.out.println("Enter your gender:");
        char gender = s.next().charAt(0);
        System.out.println("Enter your age:");
        int age = s.nextInt();
        System.out.println("Enter your contact number:");
        long contact = s.nextLong();

        System.out.println("name:" +name);
        System.out.println("gender:" +gender);
        System.out.println("age:" +age);
        System.out.println("contact number:" +contact);
    }
}
