package factorymethod.factorymethod;

import factorymethod.object.ProductB;
import factorymethod.object.ProductI;

public class FactoryB implements FactoryI {
  @Override
  public ProductI create() {
      return new ProductB();
  }
}