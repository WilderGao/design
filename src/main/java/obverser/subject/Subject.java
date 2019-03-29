package obverser.subject;

import obverser.obverser.BaseObserver;

/**
 * @author Wilder Gao
 * time:2018/7/11
 * description：通知者接口
 * motto: All efforts are not in vain
 */
public interface Subject {
    String subjectState = null;
    /**
     * 增加观察者
     * @param observer 观察者
     */
    void attach(BaseObserver observer);

    /**
     * 删除观察者
     * @param observer 观察者
     */
    void detach(BaseObserver observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

    /**
     * 通知者状态
     * @return
     */
    String getSubjectState();

    void setSubjectState(String subjectState);

}
