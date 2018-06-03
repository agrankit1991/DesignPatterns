package com.agrankit.designpatterns.creational.abstractfactory;

public class ResearchPaperFactory implements BookFactory {

  public ResearchPaperFactory() { }

  public ResearchPaperFactory(String author, String title, String publisher) {
    makeBook(author, title);
    makePublisher(publisher);
    System.out.printf("Made an BookFactory of type: " + this.getClass().getName());
  }

  @Override
  public Book makeBook(String author, String title) {
    return new ResearchPaper(author, title);
  }

  @Override
  public Publisher makePublisher(String name) {
    return new ScientificJournal(name);
  }
}
