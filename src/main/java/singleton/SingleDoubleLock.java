package singleton;

/**
 * @author wilder
 * @date 19-3-11 上午12:40
 * description 双重锁的单例模式
 */
public class SingleDoubleLock {
    private volatile SingleDoubleLock singleDoubleLock;

    private SingleDoubleLock(){}

    public SingleDoubleLock getSingleDoubleLockInstance() {
        if (singleDoubleLock == null){
            synchronized(SingleDoubleLock.class){
                if (singleDoubleLock == null){
                    singleDoubleLock = new SingleDoubleLock();
                }
            }
        }
        return singleDoubleLock;
    }
}
