package com.stackroute;
/*
Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()

Input: 98,96,95,94,93

Output: 98,96,95,94,93   non consecutive numbers

Input: 54,53,52,51,50,49,48

Output : 54,53,52,51,50,49,48 are consecutive numbers

 */

import java.util.Arrays;
import java.util.Scanner;

public class ConsequtiveNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Could You please enter the 7 Numbers sperated by comma ',':");
        String input = in.next();
        int numbers[] = consecutive(input);
        int snumbers[] = sort(numbers);
        boolean consequtive = isConsequtive(snumbers);
        if (consequtive)
            System.out.print(input + " are a Consective Numbers");
        else
            System.out.println(input + " are Not a consequtive Numbers");
    }

    /*
    consecutive method is used convert numbers in string into numbers array it takes String argument which is entered by user.
     */
    public static int[] consecutive(String input) {
        String snumbers[] = input.split(" ,");
        String k[] = snumbers[0].split(",");
        int numbers[] = new int[k.length], i = 0;
        for (String v : k) {
            int num = Integer.parseInt(v);
            numbers[i++] = num;
        }
        return numbers;
    }
/*
sort method takes integer num array as argument and then it going to sort array and then it return sorted array.
 */

    //To Sort integers in array
    public static int[] sort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++)
                if (num[i] < num[j]) {
                    int t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
        }
        return num;
    }

    //isConsequtive method takes sorted array as argument then it is going to Check where all numbers are consequtive or not
    // it going to return boolean value true or false.
    public static boolean isConsequtive(int numbers[]) {
        int c = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 == numbers[i + 1]) {
                c++;
                System.out.println(c);
            }
        }
        if (c == numbers.length)
            return true;
        else
            return false;
    }

}
