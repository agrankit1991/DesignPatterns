package com.agrankit.designpatterns.creational.abstractfactory;

public class Program {

  public static void main(String[] args) {
    BookFactory poemFactory = new PoemFactory("Edgar Allan Poe", "The Raven", "The American Review");

    BookFactory researchPaperFactory = new ResearchPaperFactory("Charles Darwin", "On the Origin of Species", "John Purray");
  }
}
