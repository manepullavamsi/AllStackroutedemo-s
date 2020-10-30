package com.stackroute;

import java.util.Scanner;

/*
Write a Calculator method.
Take two Numbers from user
Then take an option from user which operation need to perform.
Addtion,Subtraction,Multiplication,Division.
Ask user again he need to continue if not terminate.
 */
public class Calculator {
    int a, b;

    public static void main(String[] args) {
        // write your code here
        Calculator ob = new Calculator();
        ob.Calculator();


    }

    public void Calculator() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = in.nextInt();
        System.out.println("Enter the Second Number");
        b = in.nextInt();
        System.out.println("Enter the Number Beside the operation to perform:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        int option = in.nextInt();
        char r;
        switch (option) {
            case 1:
                System.out.println(a + " " + " + " + b + " = " + (a + b));
                System.out.println("Do You Want to try again(y/n) : ");
                r = in.next().charAt(0);
                if (r == 'y')
                    Calculator();
                else
                    break;

            case 2:
                System.out.println(a + " " + " - " + b + " = " + (a - b));
                System.out.println("Do You Want to try again(y/n) : ");
                r = in.next().charAt(0);
                if (r == 'y')
                    Calculator();
                else
                    break;

            case 3:
                System.out.println(a + " " + " * " + b + " = " + (a * b));
                System.out.println("Do You Want to try again(y/n) : ");
                r = in.next().charAt(0);
                if (r == 'y')
                    Calculator();
                else
                    break;

            case 4:
                System.out.println(a + " " + " / " + b + " = " + (a / b));
                System.out.println("Do You Want to try again(y/n) : ");
                r = in.next().charAt(0);
                if (r == 'y')
                    Calculator();
                else
                    break;

        }
    }
}