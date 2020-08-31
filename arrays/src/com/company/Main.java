package com.company;

public class Main {

    public static void main(String[] args) {

        String s = "Vandna";

        char[] a = s.toCharArray();
        int length = a.length;
        System.out.println("length of the string is =" +length);

        for (int i = length-1; i>=0; i--){
            System.out.print(a[i]);
        }
    }
}