package singleton.lazy.object;

public class Singleton2 {
    private static Singleton2 instance = null;
    private Singleton2() {

    }

    /**
     * 解决线程安全问题的方法有很多，比如我们可以在getInstance()方法前面加上synchronized关键字来解决，如下：
     * 但是synchronized关键字锁住的是这个类，这样的用法在性能上会有所下降，因为每次调用getInstance()时都要对对象上锁
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}