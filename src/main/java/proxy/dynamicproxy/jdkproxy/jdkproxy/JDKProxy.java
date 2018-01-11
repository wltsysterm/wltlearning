package proxy.dynamicproxy.jdkproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理，只能用于已经实现了接口的类，而不能只是用于类
 */
public class JDKProxy implements InvocationHandler {

    /**
     * 需要代理的目标对象
     */
    private Object targetObject;

    /**
     * 将目标对象传入进行代理
     * @param targetObject
     * @return
     */
    public Object getProxy(Object targetObject) {
        this.targetObject = targetObject;
        //返回代理对象
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }    
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)//invoke方法
            throws Throwable {
        //一般我们进行逻辑处理的函数比如这个地方是模拟检查权限
        checkPopedom();
        // 设置方法的返回值
        Object ret = null;
        //调用invoke方法，ret存储该方法的返回值
        ret  = method.invoke(targetObject, args);
        return ret;    
    }    
    
    private void checkPopedom() {//模拟检查权限的例子    
        System.out.println(".:检查权限  checkPopedom()!");    
    }    
}