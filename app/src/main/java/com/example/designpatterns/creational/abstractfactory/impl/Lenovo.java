package com.example.designpatterns.creational.abstractfactory.impl;

import com.example.designpatterns.creational.abstractfactory.inter.Component;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public class Lenovo implements Component.Display {

  @Override public void show() {
    System.out.println("显示器:Lenovo");
  }
}
