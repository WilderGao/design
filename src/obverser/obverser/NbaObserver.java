package obverser.obverser;

import obverser.subject.Subject;

/**
 * @author Wilder Gao
 * time:2018/7/11
 * description：
 * motto: All efforts are not in vain
 */
public class NbaObserver extends BaseObserver {

    public NbaObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSubjectState()+","+name+"赶紧停止看NBA");
    }
}
