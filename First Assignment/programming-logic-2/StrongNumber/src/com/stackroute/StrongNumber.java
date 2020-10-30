package com.stackroute;
/*
1.To Find Whether Given number is Strong Number or not
2.Take number form user
3.Create a method Strong to find whether number is strong or not.
4.Create a method called fact to calculate factorial.
 */
import java.util.Scanner;
public class StrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        strong(num);

    }
    public static void strong(int num)
    {
        int t=num,sum=0;
        while(t!=0)
        {
            int r=t%10;
            sum+=fact(r);
            t=t/10;
        }
        if(sum == num)
            System.out.println("\"Congrats You Entered  Strong Number\"");
        else
            System.out.println("!opps You Entered Just a Number not a Strong Number!...");

    }
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
           fact*=i;
        }
        return fact;
    }

}
