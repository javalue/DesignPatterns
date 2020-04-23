package com.example.designpatterns.structural.decorator;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public class TestDecorator {

  public static void main(String[] args) {
    XiaoMing xiaoMing = new XiaoMing();

    ConcreteDecorator concreteDecorator = new ConcreteDecorator(xiaoMing);
    concreteDecorator.eat();
  }
}
