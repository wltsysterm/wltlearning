package proxy.staticproxy.test;

import proxy.staticproxy.object.ProxyStar;
import proxy.staticproxy.object.RealStar;
import proxy.staticproxy.object.Star;

public class Client {
    /**
     * 静态代理
     *
     * 在代理类中，可以看到，维护了一个Star对象，通过构造方法传进来一个真实的Star对象给其赋值，然后在唱歌这个方法里，使用真实对象来唱歌。所以说面谈、收钱都是由代理对象来实现的，唱歌是代理对象让真实对象来做。
     * 运行程序可以看出，客户端只跟代理对象打交道，代理对象把能做的都做了，比如面谈和收钱，唱歌呢，是调用真实对象去唱。
     * @param args
     */
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.sing();
        proxy.collectMoney();
    }

}