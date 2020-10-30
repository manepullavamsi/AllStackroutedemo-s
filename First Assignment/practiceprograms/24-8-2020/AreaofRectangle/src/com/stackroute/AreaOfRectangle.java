package com.stackroute;
import java.util.Scanner;
public class AreaOfRectangle {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        float len,wid;
        System.out.print("Please enter a length and width of an rectangle to calculate area of rectangle");
        len=in.nextFloat();
        wid=in.nextFloat();
        System.out.println("Area of Rectangle is : "+(len*wid));
    }
}
