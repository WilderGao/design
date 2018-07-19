package singleton;

/**
 * @author Wilder Gao
 * time:2018/7/19
 * description：单例模式最简单的写法
 * motto: All efforts are not in vain
 */
public class SingletonBasic {
    private static SingletonBasic singletonBasic;

    private SingletonBasic(){}

    public static SingletonBasic getInstance(){
        if (singletonBasic == null){
            singletonBasic = new SingletonBasic();
        }
        return singletonBasic;
    }


    public static void main(String[] args) {
        SingletonBasic s1 = SingletonBasic.getInstance();
        SingletonBasic s2 = SingletonBasic.getInstance();
        if (s1 == s2){
            System.out.println("两个类实例化指定同一个地址");
        }
    }

}
