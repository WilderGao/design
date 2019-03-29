package visitor.action;

import visitor.BaseAction;
import visitor.role.Man;
import visitor.role.Woman;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：
 * motto: All efforts are not in vain
 */
public class Failing extends BaseAction {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("失败的男人会待在一旁喝闷酒");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("失败的女人会选择疯狂购物");
    }
}
