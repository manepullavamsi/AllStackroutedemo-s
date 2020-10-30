package com.stackroute;

public class BookService {
    public Author createAuthor(String name,String country)
    {
        Author author = new Author();
        author.setName(name);
        author.setCountry(country);
        return author;
    }
    public Book createBook(long ibsn,String title,String edition,String name,String country)
    {
        Book book =new Book();
        book.ibsn =ibsn;
        book.title=title;
        book.edition=edition;
        book.name=name;
        book.country=country;
        return book;
    }

    public static void main(String[] args)
    {
	// write your code here
        Author author=new Author("venkateshwara","Ananmyya");
        Book book=new Book(123,"Devoutional","TTD",author.name);
        BookService bookService = new BookService();
        bookService.createAuthor(author.name,author.country);
        bookService.createBook(book.ibsn,book.title,book.edition,book.name,book.country);

    }

}
