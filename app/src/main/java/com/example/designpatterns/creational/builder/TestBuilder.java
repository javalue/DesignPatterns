package com.example.designpatterns.creational.builder;

/**
 * @author tong.xu
 * @date 2020/4/2.
 * description：
 */
public class TestBuilder {

  public static void main(String[] args) {
    Charges charges = new Charges.Builder().body("1").amount("123").builder();
    charges.Pay();
  }
}
