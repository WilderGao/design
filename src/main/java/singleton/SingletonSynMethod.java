package singleton;

/**
 * @author WilderGao
 * time 2019-03-24 19:22
 * motto : everything is no in vain
 * description 简单懒汉式搞不定的话，可以在方法里面加一个Synchronized，但是效率会下降
 */
public class SingletonSynMethod {
    private static SingletonSynMethod singletonSynMethod = null;

    private SingletonSynMethod() {
    }

    /**
     * 根据方法锁住的话会导致效率下降
     * @return
     */
    public synchronized static SingletonSynMethod getInstance(){
        if (singletonSynMethod == null){
            singletonSynMethod = new SingletonSynMethod();
        }
        return singletonSynMethod;
    }
}
