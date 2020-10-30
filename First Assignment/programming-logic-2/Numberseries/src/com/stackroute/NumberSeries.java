package com.stackroute;

import java.util.Scanner;

public class NumberSeries {
    // In this we take integer from user upto where series of paricular number printed that number of times
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a Number upto Where Number series to Print");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

        }
    }
}
