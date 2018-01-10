package factorymethod.test;

import factorymethod.factorymethod.FactoryA;
import factorymethod.factorymethod.FactoryB;
import factorymethod.factorymethod.FactoryI;
import factorymethod.object.ProductI;

// 工厂方法模式
/**
 * 工厂方法是针 对每一种产品提供一个工厂类 。通过不同的工厂实例来创建不同的产品实例。
 在同一等级结构中， 支持增加任意产品 。
 */
public class Client {
  public static void main(String[] args) {
      FactoryI factoryA = new FactoryA();//第一个工厂，只生产A这个对象，这边没有型号概念
      ProductI productA = factoryA.create();
      productA.productName();
      //
      FactoryI factoryB = new FactoryB();//第二个工厂，只生产B这个对象，这边没有型号概念
      ProductI productB = factoryB.create();
      productB.productName();
  }
}