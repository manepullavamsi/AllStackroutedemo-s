package com.stackroute;

import java.util.Scanner;

public class TestProduct {
    //here we are creating object of product class while calling product class parameterized constructor we are setting insrtance values of product class.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String productName, productCode;
        double productPrice;
        System.out.print("Please enter ProductName , productCode , productPrice ");
        productName = in.next();
        productCode = in.next();
        productPrice = in.nextDouble();

        Product productOne = new Product(productName, productCode, productPrice);
        Product productTwo = new Product();

        productOne.display();

    }


}