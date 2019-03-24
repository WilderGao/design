package singleton;

/**
 * @author WilderGao
 * time 2019-03-24 19:48
 * motto : everything is no in vain
 * description 内部类懒汉式实现单例
 */
public class SingletonInner {
    private SingletonInner() {
    }

    private static class Inner{
        /**
         * 创建单例对象
         */
        private static final SingletonInner singletonInner = new SingletonInner();
    }

    public final  SingletonInner getInstance(){
        return Inner.singletonInner;
    }

}
