package com.stackroute;
import java.util.Scanner;
public class TestProduct {
    //reference of Product class is created then we are going call a setter method vby passing arguments to particular class
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String productName,productCode;
        double productPrice;
        System.out.print("Please enter ProductName , productCode , productPrice ");
        productName=in.next();
        productCode=in.next();
        productPrice=in.nextDouble();
        Product obj1 = new Product();
        obj1.setter(productName,productCode,productPrice);
        obj1.getter();

    }



}
