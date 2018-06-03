package com.agrankit.designpatterns.creational.abstractfactory;

public class Publisher {
  private String name;

  public Publisher() { }

  public Publisher(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
