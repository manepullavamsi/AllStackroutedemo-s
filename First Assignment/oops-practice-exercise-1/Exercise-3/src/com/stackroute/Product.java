package com.stackroute;

import java.util.Scanner;

public class Product {
    private String productCode;
    private String productName;
    private double productPrice;

    public Product() {
    }

    Product(String productName, String productCode, double productPrice) {
        this.productCode = productCode;       //parameterized constructor is going to set values of class members.
        this.productName = productName;       //here
        this.productPrice = productPrice;
    }

    //
    void display() {
        System.out.println("ProductCode   : " + productCode);
        System.out.println("Product Name  : " + productName);
        System.out.println("Product Price : " + productPrice);
    }
}