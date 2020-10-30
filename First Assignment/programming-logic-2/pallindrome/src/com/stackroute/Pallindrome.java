package com.stackroute;

import java.util.Scanner;

public class Pallindrome {
//Taking input from user calling pallindrome method to evaluate whether it is an pallindrome or not

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("please enter a number to check whether it is pallindrome or not");
        long num = in.nextLong();
        pallindrome(num);
    }

    //This method is used to check whether is an pallindrom or not
    public static void pallindrome(long num) {

        long t = num, rev = 0, sum = 0;
        while (t != 0) {
            long r = t % 10;
            rev = rev * 10 + r;
            t = t / 10;
            if (r % 2 == 0)
                sum += r;

        }
        if (rev == num) {
            if (sum > 25)
                System.out.println(num + " is a pallindrome and sum of even numbers is greater than 25.");
            else
                System.out.println(num + " is a pallindrome and sum of even numbers is less than 25,");
        } else
            System.out.print(num + "is not a pallindrome");
    }
}