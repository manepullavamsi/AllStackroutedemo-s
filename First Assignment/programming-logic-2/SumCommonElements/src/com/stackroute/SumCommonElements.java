package com.stackroute;

import java.util.Scanner;

public class SumCommonElements {
    //..Enter values into an arrays
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array you want");
        int l = in.nextInt(), sum = 0;
        int a1[] = new int[l];
        int a2[] = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Enter the " + i + " th index element of an array1 : ");
            a1[i] = in.nextInt();
            System.out.print("Enter the " + i + " th index element of an array2 : ");
            a2[i] = in.nextInt();
            System.out.println();
        }
        //Using for loops compare values to find common elements between two arrays.
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (a1[i] == a2[j]) {
                    System.out.println("Common elements are " + a1[i]);
                    sum += a1[i];
                }
            }
        }
        /*This works when we consider common elements with respective indexes
        for (int j=0;j<l;j++)
        {
            if (a1[j] == a2[j]) {
                System.out.println("Common elements are " + a1[j]);
                sum += a1[j];
            }
        }*/
        System.out.print("The sum of common elements in two arrays is : " + sum);
    }
}