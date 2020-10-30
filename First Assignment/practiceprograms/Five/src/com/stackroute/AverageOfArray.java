package com.stackroute;
import java.util.Scanner;
public class AverageOfArray {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of an array ");
        int l=in.nextInt(),sum=0;
        int a[]=new int[l];
        System.out.print("Enter numbers into an array to calculate the average of an array");
        for(int i=0;i<l;i++)
        {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        System.out.println("The average of array elements "+(sum/l));

    }
}
