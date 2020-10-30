package com.stackroute;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {

    public static void main(String[] args) {
	// write your code here
        System.out.println(findBinaryNumbersSequence(10));
        System.out.println(findBinaryNumbersSequence(30));
    }
    /*
    -Should accept number as input

-Should generate the binary numbers from 1 to N and return as a result

-Should return "Give proper input not zero or negative" if the given number is zero or

negative

-Should return "Give proper input not greater than 20" if the given number is greater

than 20

     */
    static String findBinaryNumbersSequence(int num)
    {
        if(num<=0)
            return "Give proper input not zero or negative";
        if(num>20)
            return "Give proper input not greater than 20";
        Queue<String> binary = new LinkedList<String>();
        binary.offer("1");
        String result="";
        while(num!=0)
        {
            String s1=binary.peek();
            binary.remove();
            result+=s1+" ";
            String s2=s1;
            binary.offer(s1+"0");
            binary.offer(s1+"1");
            num--;
        }
        return result;
    }
}
