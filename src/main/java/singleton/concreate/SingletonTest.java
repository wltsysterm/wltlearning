package singleton.concreate;

public class SingletonTest {
  
    public static void main(String[] args) {  
        int num = 5;  
        for(int i = 0; i < num; i++) {  
            Singleton instance = Singleton.getInstance();  
            instance.test();  
        }  
    }  
} 