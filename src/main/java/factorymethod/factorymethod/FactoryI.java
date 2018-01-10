package factorymethod.factorymethod;

import factorymethod.object.ProductI;

public interface FactoryI {
  // 工厂的目的是为了生产产品
  ProductI create();
}