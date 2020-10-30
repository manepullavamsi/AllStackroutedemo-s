package com.stackroute;

import java.util.Scanner;

public class Count9 {
    //first we take elements into an array then we are traversing array with loop in order to find the No: of 9's present in an array.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = in.nextInt(), c = 0;
        int a[] = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = in.nextInt();
        }
        for (int v : a) {
            if (v == 9)
                c++;
        }
        System.out.print("Therefore number of 9's in an array is " + c);
    }
}
