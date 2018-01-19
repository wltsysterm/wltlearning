package singleton.concreate;

import java.util.ArrayList;
import java.util.Random;

/*************************** 单例模式的扩展：程序清单3 ************************************/
public class Singleton {  
    //定义最多能产生的实例数量  
    private static int maxNumOfInstance = 3;  
      
    //存储每个实例的名字  
    private static ArrayList<String> nameList = new ArrayList<String>();
      
    //存储每个实例对象  
    private static ArrayList<Singleton> instanceList = new ArrayList<Singleton>();  
      
    //当前实例的索引  
    private static int indexOfInstance = 0;  
      
    //静态代码块，在类加载的时候初始化2个实例  
    static {  
        for(int i = 0; i < maxNumOfInstance; i++) {  
            instanceList.add(new Singleton("instance" + (i+1)));  
        }  
    }  
      
    private Singleton() {  
          
    }  
    private Singleton(String name) { //带参数的私有构造函数  
        nameList.add(name);  
    }  
      
    //返回实例对象  
    public static Singleton getInstance() {  
        Random random = new Random();
        //随机挑选一个实例  
        indexOfInstance = random.nextInt(maxNumOfInstance);  
        return instanceList.get(indexOfInstance);  
    }  
    public void test() {  
        System.out.println(nameList.get(indexOfInstance));  
    }  
}  