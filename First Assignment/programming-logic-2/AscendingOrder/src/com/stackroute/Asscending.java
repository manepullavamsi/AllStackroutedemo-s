package com.stackroute;

import java.util.Scanner;

/*
1.Arrange four integers in asscending order.
 2.Take Four Numbers from User then.
 3.Arrange four number in asscending order.
 4.Print the four numbers in asscending order.
 */
public class Asscending {

    public static void main(String[] args) {

        int a, b, c, d, low1, low2, lowest, highest, high1, high2, mid1, mid2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number");
        a = in.nextInt();
        System.out.print("Enter Second Number");
        b = in.nextInt();
        System.out.print("Enter Third Number");
        c = in.nextInt();
        System.out.print("Enter Fourth Number");
        d = in.nextInt();
        if (a < b) {
            low1 = a;
            high1 = b;
        } else {
            low1 = b;
            high1 = a;
        }
        if (c < d) {
            low2 = c;
            high2 = d;
        } else {
            low2 = d;
            high2 = c;
        }
        if (low1 < low2) {
            lowest = low1;
            mid1 = low2;
        } else {
            lowest = low2;
            mid1 = low1;
        }
        if (high1 < high2) {
            mid2 = high1;
            highest = high2;
        } else {
            mid2 = high2;
            highest = high1;
        }
        if (mid1 < mid2) {
            System.out.print("The ascending order of given four numbers is: " + lowest + " , " + mid1 + " , " + mid2 + " , " + highest);
        } else {
            System.out.println("The ascending order of given four numbers is: " + lowest + " , " + mid2 + " , " + mid1 + " , " + highest);
        }
    }
}