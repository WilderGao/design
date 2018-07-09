package visitor.role;

import visitor.BaseAction;
import visitor.Person;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：
 * motto: All efforts are not in vain
 */
public class Woman extends Person {
    @Override
    public void accept(BaseAction action) {
        action.getWomanConclusion(this);
    }
}
