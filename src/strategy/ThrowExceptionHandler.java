package strategy;

/**
 * @author WilderGao
 * time 2019-03-24 20:42
 * motto : everything is no in vain
 * description 通过抛异常拒绝
 */
public class ThrowExceptionHandler implements RejectHandler {
    @Override
    public void method() {
        System.out.println("通过抛异常解决...");
    }
}
