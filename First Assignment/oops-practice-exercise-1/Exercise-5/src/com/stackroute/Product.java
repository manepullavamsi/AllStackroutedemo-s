package com.stackroute;
import java.lang.String;
//import com.sun.org.apache.xpath.internal.operations.String;

public class Product {
    private String productCode;
    private String productName;
    private double productPrice;
    private char categoryCode='F';
    private static int productCounter=100;
    //constructor parameterized with 3 arguments
    public Product(String productName,double productPrice,char categoryCode)
    {
        this.productName=productName;
        this.productPrice=productPrice;
        this.categoryCode=categoryCode;
        productCode=generateProductCode();
    }
    //overloaded 2 parameterized constructor
    public Product(double productPrice,String productName)
    {
        this.productName=productName;
        this.productPrice=productPrice;
        productCode=generateProductCode();
        categoryCode='E';
    }
    //this method is used to return a string contains all product code price etc.,
    public String getProductDetails()
    {
        String result="ProductCode : "+productCode+",\tProductName : "+productName+",\tProductPrice : "+productPrice+",\tProductCategory : "+categoryCode;
        return result;
    }
    public void setter(String productName, String productCode, double productPrice,char categoryCode)
    {
        this.productName=productName;
        this.productCode=productCode;
        this.productPrice=productPrice;
        this.categoryCode=categoryCode;
    }
    public String  getproductCode( )
    {
        return productCode;
    }
    public String getproductName( )
    {
        return productName;
    }
    public double getproductPrice( )
    {
        return productPrice;
    }
    public char getcategoryCode( )
    {
        return categoryCode;
    }
    private String generateProductCode()
    {
        productCounter++;
        return  categoryCode+Integer.toString(productCounter);
    }



}
