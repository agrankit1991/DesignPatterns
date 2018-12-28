package com.agrankit.designpatterns.behavioral.iterator;

public class Main {

  public static void main(String[] args) {
    new BookStore(new BookCollection()).displayBooks();
  }

}
