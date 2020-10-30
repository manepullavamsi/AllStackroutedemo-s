package com.stackroute;

public class Book {
 long ibsn;
 String title;
 String edition;
 String author;
String name;
String country;
public Book(long ibsn,String author,String title,String edition)
{
    this.ibsn=ibsn;
    this.author=author;
    this.title=title;
    this.edition=edition;
}
public Book()
{

}


    public String getBookDetails()
{
    Author author= new Author();
    return "Book{isbn='"+ibsn+"', title="+title+"',edition='"+edition+"',author="+author.getAuthorDetails()+"}";
}
}
