package com.stackroute;

public class Product {
    private int id;
    private String name;
    private String descrption;
    Product(int id,String name,String descrption)
    {
        this.id=id;
        this.name=name;
        this.descrption=descrption;
    }
    public String getProductDetails()
    {
        return "Product{name='"+name+"', description='"+descrption+"'}";
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getDescrption()
    {
        return descrption;
    }


    public static void main(String[] args) {
	// write your code here

    }
}
