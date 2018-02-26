package singleton.lazy.object;

public class Singleton5 {
    private static volatile Singleton5 instance = null;
    private Singleton5() {

    }

    /**
     * 在JDK1.5之后，可以使用volatile变量禁止指令重排序
     * volatile的另一个语义是保证变量修改的可见性。
     * @return
     */
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}