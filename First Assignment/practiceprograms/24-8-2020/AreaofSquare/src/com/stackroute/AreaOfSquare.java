package com.stackroute;
import java.util.Scanner;
public class AreaOfSquare {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.print("Please Enter length of side To calculate Area of Square : ");
        float a=in.nextFloat();
        System.out.println("Area of Square is "+(a*a));
    }
}
