package com.agrankit.designpatterns.behavioral.iterator;

import java.util.Iterator;

public interface Collection {
  Iterator createIterator();
}
