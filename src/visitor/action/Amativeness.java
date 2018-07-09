package visitor.action;

import visitor.BaseAction;
import visitor.role.Man;
import visitor.role.Woman;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：恋爱时
 * motto: All efforts are not in vain
 */
public class Amativeness extends BaseAction {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("男人恋爱时，不懂也要装懂");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("女人恋爱时，懂也要装不懂");
    }
}
