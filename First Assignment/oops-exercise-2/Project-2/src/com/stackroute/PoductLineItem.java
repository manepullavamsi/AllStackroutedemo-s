package com.stackroute;

import java.util.List;

public class PoductLineItem {
    private int id;
    private int quantity;
    private Product product;
    PoductLineItem(int id,int quantity,Product product)
    {
        this.id=id;
        this.quantity=quantity;
        this.product=product;
    }
    public PoductLineItem()
    {

    }
    public int getId()
    {
        return id;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public Product getProduct()
    {
        Product product=new Product(id,"Machinery","It works well giving 5 Years warranty.");
        return product;
    }
    public String getIteamDetails()
    {
        return "ProductLineItem{id="+id+",quantity='"+quantity+"',Product=Product{id='"+product.getId()+"',name='"+product.getName()+"',descrption='"+product.getDescrption()+"'}}";
    }

}
