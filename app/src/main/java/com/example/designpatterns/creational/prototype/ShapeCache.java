package com.example.designpatterns.creational.prototype;

import java.util.Hashtable;

/**
 * @author tong.xu
 * @date 2020/4/3.
 * description：
 */
public class ShapeCache {

  private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

  public static Shape getShape(String shapeId) {
    Shape cachedShape = shapeMap.get(shapeId);

    //重点是这句
    return (Shape) cachedShape.clone();
  }

  // 对每种形状都运行数据库查询，并创建该形状
  // shapeMap.put(shapeKey, shape);
  // 例如，我们要添加三种形状
  public static void loadCache() {
    Rectangle rectangle = new Rectangle();
    rectangle.setId("1");
    shapeMap.put(rectangle.getId(),rectangle);
  }
}
