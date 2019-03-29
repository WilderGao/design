package factory.normal;

/**
 * @author WilderGao
 * time 2019-03-24 20:01
 * motto : everything is no in vain
 * description 工厂方法模式，他是好处就是每加上一种操作不会影响到前面的类
 * 但是因为每一增加一个操作就要去实现一个类，当类很多的时候就会创建出太多的类了
 */
public interface OperationFactory {
    int operation(int a, int b);
}
