package com.stackroute;
import java.util.Scanner;
public class AverageOf5Numbers {

    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        int sum=0;
        System.out.println("please enter 5 integers to calculate average of it");
        for(int i=0;i<5;i++)
        {
            int t=in.nextInt();
            sum+=t;
        }
        System.out.print("Average of 5 numbers is: "+(sum/5));
    }
}
