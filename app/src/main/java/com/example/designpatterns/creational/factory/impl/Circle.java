package com.example.designpatterns.creational.factory.impl;

import com.example.designpatterns.creational.factory.inter.Shape;

public class Circle implements Shape {
  @Override public void draw() {
    System.out.println("Inside Circle::draw() method.");

  }
}
