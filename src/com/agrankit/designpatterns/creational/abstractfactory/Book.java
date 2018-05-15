package com.agrankit.designpatterns.creational.abstractfactory;

public class Book {
  private String author;
  private String title;

  public Book() { }

  public Book(final String author, final String title) {
    this.author = author;
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}