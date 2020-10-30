package com.stackroute;

public class Triangle {

    Triangle(float s1,float s2,float s3)
    {
        float perimeter=s1+s2+s3;
        float s=perimeter/2;
        double area=Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
        System.out.println("Area of Triangle is : "+area+"\nPerimeter of an Triangle is : "+perimeter);
    }
    public static void main(String[] args) {
        // write your code here

        Triangle obj= new Triangle(3,4,5);
    }
}