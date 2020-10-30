package com.stackroute;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductOrder {
    private int id;
    private String name;
    private PoductLineItem lineItems;
    ProductOrder(int id,String name,PoductLineItem lineItems)
    {
        this.id=id;
        this.name=name;
        this.lineItems=lineItems;

    }
    public List<PoductLineItem> getLineItems()
    {
        PoductLineItem poductLineItem=new PoductLineItem();
        poductLineItem.getIteamDetails();
       List<PoductLineItem>list=new LinkedList<PoductLineItem>();
       list.add(poductLineItem);
       return list;
    }

    public void addItem()
    {

    }
    public String removeItemById(int itemId)
    {
    return "This Item removed from cart ItemId:"+itemId+"name of product";
    }
}
