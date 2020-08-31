package com.company;

public class Main
{
    static int[] a = {4,3,5,2,1,6};

    static int max()
    {

        int i;
        int max = a[0];
        for (i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

                return max;

    }

    public static void main(String[] args) {
        System.out.println("the largest element is = "+max());
    }
}
