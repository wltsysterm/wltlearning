package proxy.dynamicproxy.cglibproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLibProxy动态代理类的实例   
 *     
 *    
 */    
public class CGLibProxy implements MethodInterceptor {
    /**
     * CGLib需要代理的目标对象
     */
    private Object targetObject;
    
    public Object getProxy(Object obj) {
        this.targetObject = obj;    
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());    
        enhancer.setCallback(this);    
        Object proxyObj = enhancer.create();
        // 返回代理对象
        return proxyObj;
    }    

    @Override
    public Object intercept(Object proxy, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        // 过滤方法
        if ("addUser".equals(method.getName())) {
            // 检查权限
            checkPopedom();
        }    
        obj = method.invoke(targetObject, args);    
        return obj;    
    }    
    
    private void checkPopedom() {    
        System.out.println(".:检查权限  checkPopedom()!");    
    }    
} 