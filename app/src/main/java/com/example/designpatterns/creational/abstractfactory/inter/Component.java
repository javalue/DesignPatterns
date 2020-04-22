package com.example.designpatterns.creational.abstractfactory.inter;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public interface Component {

  interface Display {
    void show();
  }

  interface Host {
    void open();
  }
}
