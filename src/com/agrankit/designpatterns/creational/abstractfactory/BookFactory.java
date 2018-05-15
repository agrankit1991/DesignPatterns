package com.agrankit.designpatterns.creational.abstractfactory;

public interface BookFactory {
  Book makeBook(String author, String title);

  Publisher makePublisher(String name);
}
