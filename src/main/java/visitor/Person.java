package visitor;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：
 * motto: All efforts are not in vain
 */
public abstract class Person {
    /**
     * 人接收对应的行为
     * @param action  行为类
     */
    public abstract void accept(BaseAction action);
}
