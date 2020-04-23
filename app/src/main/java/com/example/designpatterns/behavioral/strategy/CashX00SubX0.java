package com.example.designpatterns.behavioral.strategy;

/**
 * @author tong.xu
 * @date 2020/4/23.
 * description：
 */
public class CashX00SubX0 implements CashSuper {

  private int full;
  private int sub;

  public CashX00SubX0(int full, int sub) {
    this.sub = sub;
    this.full = full;
  }

  @Override public float calculateCash(float total) {
    return total - (int)(total *1.0f / full) * sub;
  }
}
