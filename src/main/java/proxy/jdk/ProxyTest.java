package proxy.jdk;

/**
 * @author WilderGao
 * time 2019-03-19 21:43
 * motto : everything is no in vain
 * description JDK动态代理
 */
public class ProxyTest {
    public static void main(String[] args) {
        Wilder wilder = new WilderImpl();
        wilder.coding();
        System.out.println("设置动态代理之后......");
        MyInvocationHandler handler = new MyInvocationHandler(wilder);
        Wilder proxy = (Wilder) handler.getProxy();
        proxy.coding();
    }
}
