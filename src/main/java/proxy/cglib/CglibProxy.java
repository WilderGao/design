package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wilder
 * @date 19-3-29 下午3:16
 * description
 */
public class CglibProxy implements MethodInterceptor {
    private CglibWilder wilder;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before coding, wilder is drinking...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after coding, wilder is tired");
        return result;
    }

    public CglibWilder getProxyInstance(CglibWilder wilder){
        this.wilder = wilder;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.wilder.getClass());

        enhancer.setCallback(this);
        return (CglibWilder) enhancer.create();
    }
}
