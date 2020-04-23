package com.example.designpatterns.behavioral.strategy;

/**
 * @author tong.xu
 * @date 2020/4/23.
 * description：
 */
public class CashDiscount implements CashSuper {

  private float discount;

  public CashDiscount(float discount) {
    this.discount = discount;
  }

  @Override public float calculateCash(float total) {
    return total * discount;
  }
}
