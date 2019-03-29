package proxy.cglib;

/**
 * @author wilder
 * @date 19-3-29 下午3:24
 * description
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibWilder wilder = new CglibWilder();
        CglibWilder proxyWilder = new CglibProxy().getProxyInstance(wilder);
        proxyWilder.coding();
    }
}
