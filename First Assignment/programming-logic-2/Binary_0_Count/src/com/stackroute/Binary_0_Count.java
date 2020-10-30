package com.stackroute;

import java.util.Scanner;

public class Binary_0_Count {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Could You Please enter the postive number to findout maximum consequtive 0's in binary format of number  : ");
        int num = in.nextInt();
        zeroCount(num);
    }

    public static void zeroCount(int num) {
        int bin[] = new int[30], i = 0, max = 0, c = 0;
        while (num > 0)        //This loop is used to find the binary format of Number but we need to reverse the array.
        {
            bin[i++] = num % 2;
            num = num / 2;
        }
        int binary[] = new int[i];
        for (int j = i - 1, k = 0; j >= 0 && k < i; j--, k++)    //By reversing bin array we get the binary format of an number.
        {
            binary[k] = bin[j];
        }
        for (int v : binary)  // for each loop to traverse array.
        {
            if (v == 0) {
                c += 1;                       //Here we are calculating maximum consequtive zeors in array.
                //
                if (c > max)
                    max = c;
            } else {
                c = 0;
            }
            System.out.print(v);
        }
        System.out.print(" is a binary format of number and maximum consequtive 0's are: " + max);
        System.out.println("\n\t\t\t\t\tThank You!...");
    }
}
