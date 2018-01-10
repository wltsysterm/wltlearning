package factorymethod.factorymethod;


import factorymethod.object.ProductA;
import factorymethod.object.ProductI;

public class FactoryA implements FactoryI {
  @Override
  public ProductI create() {
      return new ProductA();
  }
}