package com.agrankit.designpatterns.creational.abstractfactory;

public class Blog  extends Publisher {
  public Blog(final String name) {
    super(name);
    System.out.println("Made an Publisher of type: " + this.getClass().getName());
  }
}
