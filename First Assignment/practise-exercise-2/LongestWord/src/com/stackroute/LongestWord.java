package com.stackroute;

import java.util.Arrays;
/*
From an input string find the longest word.

       ex: input1 = "Honesty is the best policy"

       output1 = "Honesty"
 */
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        System.out.print("Could You Please Enter a String To Count Largest Word From It: ");
        String s = in.nextLine();
        String S[] = s.split(" ", 100);
        int length = 0;
        String v = " ";                  //Here we are split input string into different words with the help of split method
        // where we provide By which specfic character we need to split string and
        //another argument is  integer maximum how many splits need to perform
        //it returns array of string so we are storing it in string array
        for (String x : S) {
            if (length < x.length()) { //Here we are checking length of each word in string and trying to store largest length
                length = x.length();
                v = x;
            }
        }
        System.out.print("Lengthest Word in the String is\"" + v + "\"and its length is: " + length);

    }
}
