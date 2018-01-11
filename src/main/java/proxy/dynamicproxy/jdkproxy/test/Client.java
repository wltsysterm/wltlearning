package proxy.dynamicproxy.jdkproxy.test;

import proxy.dynamicproxy.jdkproxy.jdkproxy.JDKProxy;
import proxy.staticproxy.object.ProxyStar;
import proxy.staticproxy.object.RealStar;
import proxy.staticproxy.object.Star;

public class Client {
    /**
     * jdk动态代理
     * @param args
     */
    public static void main(String[] args) {
        Star real = new RealStar();
        JDKProxy jdkProxy = new JDKProxy();
        Star proxy = (Star) jdkProxy.getProxy(real);

        proxy.sing();
        proxy.collectMoney();
        proxy.confer();
    }

}