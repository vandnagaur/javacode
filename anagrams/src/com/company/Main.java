package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	String x = "silent";
	String y = "hitler";

	char[] a = x.toCharArray();
	char[] b = y.toCharArray();

	Arrays.sort(a);
	Arrays.sort(b);

	Boolean result = Arrays.equals(a,b);

	if (result == true){
        System.out.println("strings are anagrams");
    }
	else {
        System.out.println("strings aren't anagrams");
    }
    }
}
