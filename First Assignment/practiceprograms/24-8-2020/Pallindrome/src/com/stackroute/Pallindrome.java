package com.stackroute;


import java.util.Scanner;

public class Pallindrome
{
    public static void main(String[] args) {

        int num=input();
        boolean type=postive(num),isPallindrome;
      
            isPallindrome=pallindrome(num);
            output(isPallindrome);
      


    }
    public static int input()
    {
        Scanner in=new Scanner(System.in);
        int a=0,f=0;
        try
        {
            a=in.nextInt();
        }
        catch(Exception e)
        {
            System.out.print("please enter only integers input ");
            a=input();
        }
        return a;
    }
    public static boolean postive(int num)
    {
        if(num>0)
            return true;
        else
	{
	    System.out.println("Please enter postive value"); 
            num=input();
	    postive(num);
	}
        return false;
    }
    public static boolean pallindrome(int num)
    {

        int t=num,rev=0;
        while(t!=0)
        {
            int r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(rev==num)
            return true;
        else
            return false;
    }
    public static void output(boolean res)
    {
        if(res)
            System.out.print("Given number is pallindrome");
        else
            System.out.println("Given Number is not pallindrome");
    }
}
