package com.example.designpatterns.behavioral.strategy;

/**
 * @author tong.xu
 * @date 2020/4/23.
 * description：
 */
public class CashContext {

  CashSuper cs;

  public CashContext(int type) {
    switch (type) {
      case 1:
        cs = new CashX00SubX0(300, 100);
        break;
      case 2:
        cs = new CashDiscount(0.8f);
        break;
      case 3:
        cs = new CashDiscount(0.7f);
        break;
      case 4:
        cs = new CashDiscount(0.5f);
        break;
      default:
        cs = new CashNormal();
        break;
    }
  }

  public float total(float total) {
    return cs.calculateCash(total);
  }
}
