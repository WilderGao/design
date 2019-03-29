package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Wilder Gao
 * time:2018/7/19
 * description：多线程时候的单例模式
 * motto: All efforts are not in vain
 */
public class SingletonLock {
    private static SingletonLock singletonLock;
    private static Lock lock = new ReentrantLock();

    private SingletonLock(){}

    public static SingletonLock getInstance(){
        if (singletonLock == null){
            //加锁
            lock.lock();
            if (singletonLock == null) {
                singletonLock = new SingletonLock();
            }
            lock.unlock();
        }
        return singletonLock;
    }

    public static void main(String[] args) {
        SingletonLock singletonLock1 = SingletonLock.getInstance();
        SingletonLock singletonLock2 = SingletonLock.getInstance();
        if (singletonLock1 == singletonLock2){
            System.out.println("代表同一个对象");
        }
    }

}
