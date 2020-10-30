package com.stackroute;

import java.util.*;

public class Alternate_Array_Elements {
    //This class takes asscending order array from user and then arrange alternatvely one with max and one
// with min value sequence continues as follows
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello Could You Please Enter Length of an Array!... ");
        int l = in.nextInt();
        System.out.print("\n Now insert  Postive Numbers into an array in \"Ascending Order\" Please.");
        int a[] = new int[l];
        for (int i = 0; i < l; i++)
            a[i] = in.nextInt();
        alternative(a);
    }

    //Alternate array method is used to arrange all array elements into alternative.
    public static void alternative(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                int temp = a[a.length - 1];
                for (int j = a.length - 2; j >= i; j--) {
                    a[j + 1] = a[j];
                }
                a[i] = temp;
            }
        }
        System.out.print("\nRearrange Array Alternatively is ");
        for (int v : a)
            System.out.print(v + " , ");
        System.out.print("\b\b\b .");

    }
}
