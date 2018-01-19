package singleton.lazy.object;

public class Singleton3 {
    private static Singleton3 instance = null;
    private Singleton3() {

    }
    /**
     * 将synchronized关键字加到内部，
     * 也就是说当调用的时候是不需要加锁的，只有在instance == null的时候且创建对象的时候再加锁，
     * 这样要比上面的那种方式好。但是这种方式还是有可能会产生线程安全问题，
     * 因为JVM中创建对象和赋值操作是分开进行的，即instance = new Singleton()这句是分两步进行的。
     * 过程是这样的：JVM会为先给Singleton实例分配一个空白的内存，并赋值给instance成员，
     * 但是此时JVM并没有开始初始化这个实例，然后再去new一个Singleton对象赋给instance。
     * 这就会导致线程问题了，比如A线程进入synchronized代码块了，执行完了instance = new Singleton()后退出代码块，
     * 但是此时还没有真正初始化，这是线程B进来了，发现instance不为null，于是就立马返回该instance（其实是没有初始化好的），
     * 然后B就开始使用该instance，却发现没初始化，于是就出问题了。
     * new一个对象可形象的表示为如下三行伪代码
     * memory = allocate();        //1:分配对象的内存空间
     * ctorInstance(memory);       //2:初始化对象
     * instance = memory;        //3:使instance指向刚分配的内存地址
     * @return
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}