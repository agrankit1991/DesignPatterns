package com.agrankit.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class BookStore {
  private BookCollection bookCollection;

  public BookStore(BookCollection bookCollection) {
    this.bookCollection = bookCollection;
  }

  public void displayBooks() {
    Iterator iterator = bookCollection.createIterator();
    System.out.println("-------Book Store------------");
    while (iterator.hasNext()) {
      Book book = (Book) iterator.next();
      System.out.println(book.getName() + " " + book.getAuthorName());
    }
  }
}
