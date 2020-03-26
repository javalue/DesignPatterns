package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.impl.Blue;
import com.example.designpatterns.creational.abstractfactory.impl.Green;
import com.example.designpatterns.creational.abstractfactory.impl.Red;
import com.example.designpatterns.creational.abstractfactory.inter.Color;
import com.example.designpatterns.creational.factory.inter.Shape;

public class ColorFactory extends AbstractFactory {
  @Override public Color getColor(String color) {
    if(color == null){
      return null;
    }
    if(color.equalsIgnoreCase("RED")){
      return new Red();
    } else if(color.equalsIgnoreCase("GREEN")){
      return new Green();
    } else if(color.equalsIgnoreCase("BLUE")){
      return new Blue();
    }
    return null;
  }

  @Override public Shape getShape(String shape) {
    return null;
  }
}
