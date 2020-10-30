package com.stackroute;

public class MyCalculator {

    public static void main(String[] args) {
	// write your code here
        System.out.println(power(3,5));
        System.out.println(power(0,5));
        System.out.println(power(-1,5));
    }
    public static long power(int n,int p)
    {
        long result=0l;
       /* try {
            if (n < 0 || p < 0)//here we are checking if anyone number -ve it throw error of negative
                throw new Negative("n or p should not be negative");
            if(n==0 || p==0)//here we are checking if anyone number 0 it throw error of Zero.
                throw new Zeoro("n and p should not be Zero.");
            result=(long) Math.pow(n,p);

        }
        catch (Negative ne)//it handles -ve integer exception.
        {
            System.out.println(ne.toString());
        }
        catch (Zeoro ze)//it handles 0 integer exception.
        {
            System.out.println(ze.toString());
        }*/
        return  result;
        }
}
