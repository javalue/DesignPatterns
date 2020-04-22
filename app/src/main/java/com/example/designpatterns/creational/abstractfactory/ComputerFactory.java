package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.inter.Component;

/**
 * @author tong.xu
 * @date 2020/4/22.
 * description：
 */
public abstract class ComputerFactory {
  abstract Component.Host createHost();
  abstract Component.Display createDisplay();
}
