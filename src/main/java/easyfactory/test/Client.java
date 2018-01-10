package easyfactory.test;

import easyfactory.easyfactory.Factory;
import easyfactory.object.ProductI;

/**
 * 简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。不修改代码的话，是无法扩展的。
 */
public class Client {
  public static void main(String[] args) {
      Factory factory = new Factory();
      ProductI productA = factory.create("A");
      productA.productName();
      ProductI productB = factory.create("B");
      productB.productName();
  }
}