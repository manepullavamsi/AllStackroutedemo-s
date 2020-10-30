package com.stackroute;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {33,2,43,3,13,4,22};

        System.out.println(Arrays.toString(arr));

        arr=insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertionSort(int arr[])
    {
        for(int i=1,j;i<arr.length;i++)
        {
            int k=arr[i];                                   //insertion sort method is used to sort given integr array into sorted array.
            j=i-1;
            while (j>=0 && k<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        return arr;
    }
}
