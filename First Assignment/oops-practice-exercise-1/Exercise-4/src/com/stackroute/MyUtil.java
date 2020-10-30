package com.stackroute;

import java.lang.Math;

public class MyUtil {
    static int throwDice() {
        int r = (int) (1 + Math.random() * 6);  //Here we are using random method in order to find the random value between 1 to 6.
        return r;
    }

    static int average(int a[]) {
        int sum = 0;
        for (int v : a)//By using For Each loop we are adding elements of an array into sum variable
            sum += v;
        return (sum / a.length);//By using Average formula sum of elements/No:ofElements which will return a average of array here we are using arr.length method in order findout no:elements in an array;

    }
}
