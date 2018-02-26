package singleton.hungry.object;

/****************** 单例模式：程序清单1 ***************************/
    public class Singleton {
    /**
     * 这个程序不会产生线程同步问题，因为类第一次加载的时候就初始化了instance
     */
    private static Singleton instance = new Singleton(); //1.自己内部new一个
          
    private Singleton() { //2.私有构造函数，防止被实例化

    }
    //3.提供一个公共接口，用来返回刚刚new出来的对象
    public static Singleton getInstance() {
         return instance;
    }

    public void test() {
        System.out.println("singleton");
    }
    }