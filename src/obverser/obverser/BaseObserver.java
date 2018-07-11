package obverser.obverser;

import obverser.subject.Subject;

/**
 * @author Wilder Gao
 * time:2018/7/11
 * description：观察者接口
 * motto: All efforts are not in vain
 */
public abstract class BaseObserver {
    protected String name;
    /**
     * 通知人
     */
    protected Subject subject;

    public BaseObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
