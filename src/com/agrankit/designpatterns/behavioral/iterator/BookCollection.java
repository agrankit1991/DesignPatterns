package com.agrankit.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Collection {

  List<Book> books;

  public BookCollection() {
    this.books = new ArrayList<>();

    // add dummy books
    books.add(new Book("book1", "author1"));
    books.add(new Book("book2", "author2"));
    books.add(new Book("book3", "author3"));
    books.add(new Book("book4", "author4"));
    books.add(new Book("book5", "author5"));
  }

  public void add(Book book) {
    if (book != null) {
      books.add(book);
    }
  }

  @Override
  public Iterator createIterator() {
    return new BookIterator(books);
  }
}
