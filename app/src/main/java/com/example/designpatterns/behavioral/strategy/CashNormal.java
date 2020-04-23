package com.example.designpatterns.behavioral.strategy;

/**
 * @author tong.xu
 * @date 2020/4/23.
 * description：
 */
public class CashNormal implements CashSuper {

  public CashNormal() {
  }

  @Override public float calculateCash(float total) {
    return total;
  }
}
