package com.stackroute;

public class Author {
    String name;
    String country;
    Author(String name, String country)
    {
        this.name=name;
        this.country=country;
    }
    Author()
    {

    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getName()
    {
        return name;
    }
    public String getCountry()
    {
        return country;
    }
    public String getAuthorDetails()
    {
        return "Author{name='"+this.name+"', country='"+this.country+"'}";
    }



}
