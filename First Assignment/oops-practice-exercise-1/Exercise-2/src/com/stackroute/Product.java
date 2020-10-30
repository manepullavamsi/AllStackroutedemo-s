package com.stackroute;

public class Product {
    private String productCode;
    private String productName;
    private double productPrice;
    void setter(String productName,String productCode,double productPrice)
    {
        this.productCode=productCode;       //setter is going to set values of class members.
        this.productName=productName;       //here this is used because this refers to instance variable of particular class.
        this.productPrice=productPrice;
    }
    void getter()
    {
        System.out.println("ProductCode   : "+productCode);
        System.out.println("Product Name  : "+productName);
        System.out.println("Product Price : "+productPrice);
    }
}
