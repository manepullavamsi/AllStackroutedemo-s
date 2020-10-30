package com.stackroute;

public class TestAverage {
    //With the help of average class object we can access avg method to we overloaded avg method with different arguments
    public static void main(String[] args) {
        // write your code here
        Average average = new Average();
        System.out.println("Average of two integers is " + average.avg(2, 3));
        System.out.println("Average of Three integers is " + average.avg(3, 4, 8));
        System.out.println("Average of Two double integers is " + average.avg(3.5, 4.5));
    }
}
