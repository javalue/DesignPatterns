package com.example.designpatterns.creational.prototype;

/**
 * @author tong.xu
 * @date 2020/4/3.
 * description：
 */
public class PrototypePatternDemo {

  public static void main(String[] args) {
    ShapeCache.loadCache();

    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());
  }
}
