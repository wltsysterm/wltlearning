package singleton.lazy.object;

/**
 * @author 魏霖涛
 * @since 2018/1/18 0018
 */
public class Singleton4 {
        private Singleton4() {  //私有构造方法，防止被实例化
        }

        /**
         * 这种方式称为延迟初始化占位（Holder）类模式。该模式引进了一个静态内部类（占位类），在内部类中提前初始化实例，既保证了Singleton实例的延迟初始化，又保证了同步。这是一种提前初始化（恶汉式）和延迟初始化（懒汉式）的综合模式。
         * 使用一个内部类来维护单例  JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
        * 静态内部类的加载不需要依附外部类，在使用时才加载。不过在加载静态内部类的过程中也会加载外部类
        */
        private static class SingletonFactory {
            private static Singleton4 instance = new Singleton4();
        }

        public static Singleton4 getInstance() {  //获取实例
            return SingletonFactory.instance;
        }

        /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
        public Object readResolve() {
            return getInstance();
        }
}
