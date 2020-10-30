package com.stackroute;
import java.util.Scanner;
public class DivideNumbers {
/*
Algorithm
    1.Take input 2 Integers from user
    2.divide by each other a/b which result quotient print the result
 */
    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two integers to calculate quotient");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Quotient of "+a+" / "+b+" is = "+(a/b));
    }
}
