package com.agrankit.designpatterns.behavioral.iterator;

public class Book {

  private String name;
  private String authorName;


  public Book() { }

  public Book(String name, String authorName) {
    this.name = name;
    this.authorName = authorName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

}
