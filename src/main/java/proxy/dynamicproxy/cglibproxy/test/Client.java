package proxy.dynamicproxy.cglibproxy.test;


import proxy.dynamicproxy.cglibproxy.cglibproxy.CGLibProxy;
import proxy.dynamicproxy.cglibproxy.object.RealStar;

/**
 * cglib动态代理适用于没有实现接口的类，如果类实现了接口推荐使用jdk动态代理
 *
 * CGLib是针对类来实现代理的，他的原理是对指定的目标生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 */
public class Client {
    /**
     * cglib动态代理
     * @param args
     */
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        CGLibProxy cgLibProxy = new CGLibProxy();
        RealStar proxy = (RealStar) cgLibProxy.getProxy(realStar);
        proxy.sing();
        proxy.collectMoney();
        proxy.confer();
    }

}