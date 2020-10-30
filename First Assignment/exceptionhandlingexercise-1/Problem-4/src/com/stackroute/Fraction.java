package com.stackroute;
//Here we are writing one of unchecked exception commonly occur /0 called ArithmeticException.
public class Fraction {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fractionCalculator(12,3));
        System.out.println(fractionCalculator(12,0));//with this input it rises an arithmetic exception.
    }
    public static String fractionCalculator(int number1,int number2)
    {
        String result="";
        try{
            int fraction =number1/number2;//Here we put code where exception can rise if exception rise catch block handles it.
            result=Integer.toString(fraction);
        }
        catch (ArithmeticException ar)
        {
            System.out.println(ar);//This catch block is going to handle only Arithmetic exceptions only .
        }
        return result;//returnin string
    }
}
