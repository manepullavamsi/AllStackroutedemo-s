package com.stackroute;

import sun.security.util.ArrayUtil;
//Write a program to remove duplicate elements from the array of integers.
import java.util.Arrays;
import java.util.Scanner;

public class Remove_DuplicateElements {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Could You Please Enter The Length of an Array.");
        int l = in.nextInt();
        int num[] = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter the values into array at index :" + i + " "); //This for loop is used to take array values from user.
            num[i] = in.nextInt();
        }
        System.out.println("Array with Duplicate Values." + Arrays.toString(num));

        //sorting an array
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++)
                if (num[i] < num[j]) {
                    int t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
        }

        System.out.println("Sorted Array" + Arrays.toString(num));


        int tem[] = new int[l];
        int k = 0, i = 0;
        for (i = 0; i < l - 1; i++) {
            if (num[i] != num[i + 1])         //In this loop we are storing unique values(i.e.,Removing Duplicate Elements"). of array into temp array.
                tem[k++] = num[i];
        }
        tem[k++] = num[i];    //This is because we are not considering last index in above loop
        System.out.print("\nArray with out Duplicate  Values. ");
        for (i = 0; i < k; i++)
            System.out.print(tem[i] + " ");

    }
}
