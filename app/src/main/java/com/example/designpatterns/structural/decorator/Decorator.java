package com.example.designpatterns.structural.decorator;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public abstract class Decorator extends Person{
  private Person person;
  // 这里是重点，必须持有一个被装饰者对象。
  public Decorator(Person person) {
    this.person = person;
  }

  @Override
  public void eat() {
    person.eat();
  }
}
