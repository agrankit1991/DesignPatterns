package com.agrankit.designpatterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {

  private List<Book> books;
  private int currentPosition = 0;

  public BookIterator(List<Book> books) {
    this.books = books;
  }

  @Override
  public boolean hasNext() {
    if (books == null || currentPosition == books.size()) {
      return false;
    }
    return true;
  }

  @Override
  public Book next() {
    Book book = books.get(currentPosition);
    currentPosition++;
    return book;
  }
}
