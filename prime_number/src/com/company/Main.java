package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 13;
	int flag = 0;

	for (int i = 2; i <= n-1; i++){

	    if (n % i == 0){

	        flag = flag + 1;
        }
    }

	if (flag > 0){

        System.out.println("number is not prime");
    }
	else {

        System.out.println("number is prime");
    }
    }
}
