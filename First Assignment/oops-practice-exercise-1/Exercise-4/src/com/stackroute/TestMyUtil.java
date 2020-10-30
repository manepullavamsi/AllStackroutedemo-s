package com.stackroute;

import java.util.Scanner;
import java.lang.Math;

public class TestMyUtil {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        MyUtil myutil = new MyUtil();
        int a = myutil.throwDice();
        System.out.println("The random Number returned by throwDice is: " + a);
        System.out.println("Enter the array size");
        int l = in.nextInt();
        int arr1[] = new int[l];
        int arr2[] = new int[l];
//Taking array values from user to calculate average of each array and then print it.
        for (int i = 0; i < l; i++) {
            System.out.print("\n Enter the values into array1 of index " + i + " ");
            arr1[i] = in.nextInt();
            System.out.print("\n Enter the values into array2 of index " + i + " ");
            arr2[i] = in.nextInt();
        }

        //average of an array can be calculated by using avgerage method

        System.out.println("Average of first Array is :" + myutil.average(arr1));
        System.out.println("Average of Second Array is :" + myutil.average(arr2));
        System.out.print("Could you please enter the two Double values to find out maximum value: ");

        //finding maximum and minmum value between two values using max min methods present in Math Class
        // Finding floor value and round value and ceil value methods present in Math class

        double doble1, doble2;
        doble1 = in.nextDouble();
        doble2 = in.nextDouble();
        System.out.println("Maximum Number among two numbers is" + Math.max(doble1, doble2));
        System.out.println("Minmum Number among two numbers is " + Math.min(doble1, doble2));
        System.out.print("Please enter a number to find celling , floor , and round of an number : ");
        double doble3 = in.nextDouble();
        System.out.println("celling of Entered Number is: " + Math.ceil(doble3));
        System.out.println("floor of Entered Number is: " + Math.floor(doble3));
        System.out.println("celling of Entered Number is: " + Math.round(doble3));

    }
}
