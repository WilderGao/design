package singleton;

/**
 * @author WilderGao
 * time 2019-03-24 19:17
 * motto : everything is no in vain
 * description 单例模式饿汉式，一来就创建对象
 */
public class SingletonHungry {
    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }
}
