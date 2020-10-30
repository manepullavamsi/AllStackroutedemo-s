package com.stackroute;

public class Average {
    static double avg(int num1, int num2) {
        return (num1 + num2) / 2;                             //Here Avgerage method return average of two numbers  in the form double format
    }

    static double avg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;                     //avg() method is overloading it return average of three numbers in double type.
    }

    static double avg(double num1, double num2) {
        return (num1 + num2) / 2;                   //avg method is overloaded again here it takes two double type numbers and return average in double format.
    }
}
