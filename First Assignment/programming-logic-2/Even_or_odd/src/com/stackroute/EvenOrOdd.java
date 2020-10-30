package com.stackroute;
import java.util.Scanner;
public class EvenOrOdd {
//Here we wrote a code to take integer from user then we are evaluting whether given number is vowel or consonant
    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a Number to check whether it is even or odd");
        int num=in.nextInt();
        if(num%2==0 && (num>=20 && num <=30))
            System.out.print("Hello Jerry You entered Even Number.");
        else if(num%2!=0 && (num>=20 && num <=30))
        {
            System.out.println("Hello Tom You entered Odd Number");
        }
        else
        {
            System.out.println("Hoo Sorry You Entered Number "+num +"It should be in range of 20 to 30.");
        }


    }
}
