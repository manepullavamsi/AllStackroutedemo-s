package com.stackroute;
import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
	    float a,b,c;
        System.out.print("Could You Please Enter Three Numbers To Calculate average of it: ");
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        calculateAverage(a,b,c);
    }
    public static void calculateAverage(float a,float b,float c)
    {
        System.out.println("Average of Three Numbers is "+(int)(a+b+c/3));
    }
}
