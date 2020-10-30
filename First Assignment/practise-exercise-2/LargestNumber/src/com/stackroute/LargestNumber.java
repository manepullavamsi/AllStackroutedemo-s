package com.stackroute;
//.Write a function to get largest number in the given array.

import java.util.Scanner;

public class LargestNumber {
    //Intially array length is taken from use then array values are collected from user then we are going find max value from an array.
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Length of an array");
        int l = in.nextInt(), max = 0;
        int arr[] = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Please Enter Values into an Array. at index  " + i + " ");
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < l; i++) {
            max = arr[0];
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Maximum Value in Array is: " + max);
    }
}
