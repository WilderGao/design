package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

/**
 * @author WilderGao
 * time 2019-03-19 21:44
 * motto : everything is no in vain
 * description
 */
public class MyInvocationHandler implements InvocationHandler {

    private Wilder wilder;

    public MyInvocationHandler(Wilder wilder){
        super();
        this.wilder = wilder;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间为:"+now.toString());
        return method.invoke(wilder, args);
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(wilder.getClass().getClassLoader(), wilder.getClass().getInterfaces(),
                this);
    }


}
