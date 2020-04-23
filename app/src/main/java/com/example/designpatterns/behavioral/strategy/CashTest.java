package com.example.designpatterns.behavioral.strategy;

/**
 * @author tong.xu
 * @date 2020/4/23.
 * description：策略模式
 */
public class CashTest {

  public static void main(String[] args) {
    CashContext cashContext = new CashContext(1);
    float total = cashContext.total(1000);
    System.out.println(total);
  }
}
