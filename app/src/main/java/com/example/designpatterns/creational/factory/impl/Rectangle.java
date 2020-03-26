package com.example.designpatterns.creational.factory.impl;

import com.example.designpatterns.creational.factory.inter.Shape;

public class Rectangle implements Shape {
  @Override public void draw() {
    System.out.println("Inside Rectangle::draw() method.");

  }
}
