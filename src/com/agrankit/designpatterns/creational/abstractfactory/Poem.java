package com.agrankit.designpatterns.creational.abstractfactory;

public class Poem extends Book {
  public Poem(final String author, final String title) {
    super(author, title);
    System.out.println("Made an Book of type: " + this.getClass().getName());
  }
}
