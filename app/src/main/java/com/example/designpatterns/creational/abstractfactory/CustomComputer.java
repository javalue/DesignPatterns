package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.impl.Dell;
import com.example.designpatterns.creational.abstractfactory.impl.Lenovo;
import com.example.designpatterns.creational.abstractfactory.inter.Component;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public class CustomComputer extends ComputerFactory {

  public CustomComputer() {
    createHost().open();
    createDisplay().show();
  }

  @Override Component.Host createHost() {
    return new Dell();
  }

  @Override Component.Display createDisplay() {
    return new Lenovo();
  }
}
