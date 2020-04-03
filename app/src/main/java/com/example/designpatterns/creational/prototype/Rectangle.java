package com.example.designpatterns.creational.prototype;

/**
 * @author tong.xu
 * @date 2020/4/3.
 * description：
 */
public class Rectangle extends Shape {

  public Rectangle(){
    type = "Rectangle";
  }

  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
