package singleton;

/**
 * @author WilderGao
 * time 2019-03-24 19:25
 * motto : everything is no in vain
 * description 懒汉式升级版，在块中加锁而不是整个方法
 */
public class SingletonSynBlock {
    private static volatile SingletonSynBlock singletonSynBlock = null;

    private SingletonSynBlock() {
    }

    public static SingletonSynBlock getInstanceFirst(){
        if (singletonSynBlock == null){
            //这样子还是会存在两个线程同时进入的可能，所以要继续优化
            synchronized (SingletonSynBlock.class){
                singletonSynBlock = new SingletonSynBlock();
            }
        }
        return singletonSynBlock;
    }

    public static SingletonSynBlock getInstanceSecond(){
        if (singletonSynBlock == null){
            synchronized (SingletonSynBlock.class){
                if (singletonSynBlock == null){
                    //你以为这样子就搞定了吗？？？不是的，有可能会进行指令重排序，也就是sigletonSynBlock = new SingletonSynBlock() 可能会在判断之前
                    //那怎么办？很简单，给对象加上volatile禁止重排序
                    singletonSynBlock = new SingletonSynBlock();
                }
            }
        }
        return singletonSynBlock;
    }
}
