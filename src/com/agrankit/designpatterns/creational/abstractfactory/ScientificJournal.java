package com.agrankit.designpatterns.creational.abstractfactory;

public class ScientificJournal extends Publisher {
  public ScientificJournal(final String name) {
    super(name);
    System.out.println("Made an Publisher of type: " + this.getClass().getName());
  }
}
