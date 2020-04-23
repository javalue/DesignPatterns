package com.example.designpatterns.structural.decorator;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public class ConcreteDecorator extends Decorator {
  private static final String TAG = ConcreteDecorator.class.getSimpleName();

  public ConcreteDecorator(Person person) {
    super(person);
  }

  @Override
  public void eat() {
    dessert();
    super.eat();  // 拓展时，前后都可以加方法
    drinkTea();
  }

  // 装饰方法，甜品
  public void dessert() {
    System.out.println("dessert");
  }

  // 装饰方法，喝茶
  public void drinkTea() {
    System.out.println("drink tea");
  }
}
