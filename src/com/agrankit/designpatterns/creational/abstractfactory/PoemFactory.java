package com.agrankit.designpatterns.creational.abstractfactory;

public class PoemFactory implements BookFactory {

  public PoemFactory() { }

  public PoemFactory(String author, String title, String publisher) {
    makeBook(author, title);
    makePublisher(publisher);
    System.out.println("Made an BookFactory of type: " + this.getClass().getName());
  }

  @Override
  public Book makeBook(String author, String title) {
    return new Poem(author, title);
  }

  @Override
  public Publisher makePublisher(String name) {
    return new Blog(name);
  }
}
