package obverser.subject;

import obverser.obverser.BaseObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wilder Gao
 * time:2018/7/11
 * description：
 * motto: All efforts are not in vain
 */
public class Boss implements Subject {

    private String subjectState;
    private List<BaseObserver> observers = new ArrayList<>();

    @Override
    public void attach(BaseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(BaseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (BaseObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getSubjectState() {
        return subjectState;
    }

    @Override
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
