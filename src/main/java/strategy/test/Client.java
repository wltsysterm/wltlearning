package strategy.test;

import strategy.object.Context;
import strategy.object.OldCustomerManyStrategy;
import strategy.object.Strategy;

public class Client {

    /**
     * 在实际中，策略模式在spring中也有用到，通过注解@Resource就是使用该模式，注入哪个就使用哪个。
     * @param args
     */
    public static void main(String[] args) {

        Strategy s1 = new OldCustomerManyStrategy();
        Context ctx = new Context(s1); //通过构造方法注入策略

        ctx.getPrice(1000);
    }

}