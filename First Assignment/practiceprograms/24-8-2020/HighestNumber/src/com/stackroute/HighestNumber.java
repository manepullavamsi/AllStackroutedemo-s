package com.stackroute;
import java.util.Scanner;
public class HighestNumber {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.print("Please Enter a two Numbers to find highest among two numbers\t");
        a=in.nextInt();
        b=in.nextInt();
        int r= (a>b)?a:b;
                System.out.println(r+" is the Highest Number");

    }
}
