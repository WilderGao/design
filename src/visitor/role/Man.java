package visitor.role;

import visitor.BaseAction;
import visitor.Person;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：
 * motto: All efforts are not in vain
 */
public class Man extends Person {

    @Override
    public void accept(BaseAction action) {
        //这里采用了两次分派
        action.getManConclusion(this);
    }
}
