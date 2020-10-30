package com.stackroute;

public class TestProduct {

    public static void main(String[] args) {
        Product productOne = new Product("Lenvo",3000,'E');
        System.out.println(productOne.getProductDetails());
        Product productTwo = new Product(5000,"DELL");
        System.out.println(productTwo.getProductDetails());


    }
}
