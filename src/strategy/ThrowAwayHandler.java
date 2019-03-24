package strategy;

/**
 * @author WilderGao
 * time 2019-03-24 20:44
 * motto : everything is no in vain
 * description 直接丢弃
 */
public class ThrowAwayHandler implements RejectHandler {
    @Override
    public void method() {
        System.out.println("直接丢弃拒绝......");
    }
}
