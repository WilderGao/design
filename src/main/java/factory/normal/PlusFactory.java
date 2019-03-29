package factory.normal;

/**
 * @author WilderGao
 * time 2019-03-24 20:02
 * motto : everything is no in vain
 * description 加法工厂
 */
public class PlusFactory implements OperationFactory {
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
