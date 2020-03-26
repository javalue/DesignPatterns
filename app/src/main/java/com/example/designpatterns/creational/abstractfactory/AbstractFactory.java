package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.inter.Color;
import com.example.designpatterns.creational.factory.inter.Shape;

public abstract class AbstractFactory {
  public abstract Color getColor(String color);
  public abstract Shape getShape(String shape) ;
}
