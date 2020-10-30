package com.stackroute;

import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of Students:");
        int l = in.nextInt();
        students(l);
    }

    //In this method we are taking grades of each student and store it in an array.
    public static void students(int l) {
        int students[] = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("\n Enter the grade for student " + (i + 1) + ": ");
            students[i] = input();
        }
        avg(students);
        min(students);
        max(students);
    }

    //This method is used to take input from user and return user input to calling area.
    public static int input() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0 && a <= 100)
            return a;
        else {
            System.out.print("Please enter again grade \"Grade should be in range 0-100\" only...");
            input();
        }
        return a;
    }

    //This method is used to calculate average of an array taken from calling area and print the average value on screen.
    public static void avg(int stu[]) {
        int sum = 0;
        for (int v : stu) {
            sum += v;
        }
        System.out.print("\nThe Average is " + (sum / stu.length));

    }

    //This method is used to calculate minmum value in an array and print the minmum value.
    public static void min(int stu[]) {
        int min = stu[0];
        for (int v : stu) {
            if (min > v)
                min = v;
        }
        System.out.print("\nThe Minmum is " + min);
    }

    //This method is used to calculate the maximum value in an array and print the maximum value.
    public static void max(int stu[]) {
        int max = stu[0];
        for (int v : stu) {
            if (max < v)
                max = v;
        }
        System.out.print("\n The Maximum is " + max);
    }

}
