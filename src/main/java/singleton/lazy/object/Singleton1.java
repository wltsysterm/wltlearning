package singleton.lazy.object;

public class Singleton1 {
    private static Singleton1 instance = null;
    private Singleton1() {

    }
    /**
     * 这种方式就是非线程安全了（懒汉式单例）
     * 为什么会出现线程安全问题呢？
     * 假如一个线程A执行到instance = new Singleton()，
     * 但还没有获得对象（对象的初始化是需要时间的），
     * 第二个线程B也在执行，执行到判断instance == null时，
     * 那么线程B获得的条件也是真，于是也进入实例化instance了，
     * 然后线程A获得了一个对象，线程B也获得了一个对象，
     * 在内存中就存在了两个对象了！
     */
    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}