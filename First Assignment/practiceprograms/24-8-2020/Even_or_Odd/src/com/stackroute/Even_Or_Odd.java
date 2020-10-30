package com.stackroute;
import java.util.Scanner;
public class Even_Or_Odd {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.print("Please Enter a Number to check Wheter it is Even or Odd\t");
        int num=in.nextInt();
        if(num%2==0)
        {
            System.out.println("Entered Number is Even");
        }
        else
        {
            System.out.println("Entered number is odd");
        }
    }
}
