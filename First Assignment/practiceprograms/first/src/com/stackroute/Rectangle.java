package com.stackroute;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        float length,breadth;
        System.out.print("Enter the length and breadth of rectangle:");
        length=in.nextFloat();
        breadth=in.nextFloat();
        CalculatePerimeter(length,breadth);

    }
    static void CalculatePerimeter(float length,float breadth)
    {
        System.out.println("Perimeter of rectangle "+2*(length+breadth));
    }

}
