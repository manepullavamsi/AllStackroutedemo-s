package com.stackroute;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array1[]={1,2,3,4,5,1,2,3};
        System.out.println(findUniqueNumbersCount(array1,3));
        int array2[]={1,2,3,4,5,6};
        System.out.println(findUniqueNumbersCount(array2,5));
        int array3[]={1,2,3};
        System.out.println(findUniqueNumbersCount(array3,5));//Here we are checking method by passing different types of input to an method.
        int array4[]={1,2,3,4,5,6};
        System.out.println(findUniqueNumbersCount(array2,-4));

    }
    static String findUniqueNumbersCount(int numbers[],int subCount)
    {
        if(numbers.length==0)
        {
            return "Give proper input not empty array.";
        }
        if(numbers==null){
            return "Give proper input not null array.";
        }
        if(subCount<=0)
            return "Give proper input sub-Array length cannot be negative or zero";
        if(subCount>=numbers.length)
            return "Give proper input, sub-array length exceeds array length";
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        for (int number:numbers) {
            if(!deque.contains(number))
                deque.offerFirst(number);//Here we storing only unique values in quque.

        }
        return "Count of unique numbers is "+deque.size();
    }
}
