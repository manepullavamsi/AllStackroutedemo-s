package com.stackroute;
import java.util.Scanner;
/*
Algorithm
    1.Take kilometers from user storing in float variable
    2.print result converting kms into meters by using formula (kms*1000)
 */
public class KilometersToMeters {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter kilometers");
        float kms=in.nextFloat();
        System.out.println("Converting Kilometers to Meters"+kms+ " Kilometers is "+(kms*1000)+ " Meters");
	// write your code here
    }
}
