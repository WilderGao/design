package factory.normal;

/**
 * @author WilderGao
 * time 2019-03-24 20:03
 * motto : everything is no in vain
 * description 减法工厂
 */
public class SubFactory implements OperationFactory {
    @Override
    public int operation(int a, int b) {
        return a - b;
    }
}
