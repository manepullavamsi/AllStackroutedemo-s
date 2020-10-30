package com.stackroute;

public class TestProduct {
//In This class we are creating an object and then with that reference we are able to acess the instance variables.

    public static void main(String[] args) {

        Product productOne = new Product();
        System.out.println("Product Code: " + productOne.productCode);
        System.out.println("Product Name: " + productOne.productName);
        System.out.println("Product Price: " + productOne.productPrice);
        Product productTwo = new Product();
        productTwo.productName = "HP";
        productTwo.productPrice = 3000;   //Here instance vaiables of product class are ghanged with the object of Product Class
        productTwo.productCode = "SF234";
        System.out.println("Values after changing with object\n");
        System.out.println("Product Code: " + productTwo.productCode);
        System.out.println("Product Name: " + productTwo.productName);
        System.out.println("Product Price: " + productTwo.productPrice);
    }


}

