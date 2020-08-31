package com.company;

class Main
{
    public static void checkPalindrome(String s)
    {

        String reverse = new StringBuffer(s).reverse().toString();

        if (s.equals(reverse))
            System.out.println("String is palindrome");

        else
            System.out.println("String is not palindrome");
    }

    public static void main (String[] args)
    {
        checkPalindrome("liril");
    }
}
