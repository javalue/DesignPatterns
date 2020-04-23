package com.example.designpatterns.creational.abstractfactory.impl;

import com.example.designpatterns.creational.abstractfactory.inter.Component;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public class Dell implements Component.Host {
  @Override public void open() {
    System.out.println("主机是:Dell");
  }
}
