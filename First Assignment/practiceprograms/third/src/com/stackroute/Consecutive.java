package com.stackroute;
import java.util.Scanner;
public class Consecutive {
//Given a valid string of numbers sperated by comma check whether the given number are consecutive or not
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String input=in.next();
        String []s=input.split(",");
        int t = Integer.parseInt(s[0]),count=0;
        for(String i:s)
        {
            int current = Integer.parseInt(i);
            if (current == t)
            {
                count++;
                t++;
            }

        }
        if(count == s.length)
            System.out.println("The entered numbers are in consequetive");
        else
            System.out.println("The Given numbers are not consequtive");

	// write your code here
    }
}
