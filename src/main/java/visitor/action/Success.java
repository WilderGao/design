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
public class Success extends BaseAction {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("成功男人背后都有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("成功女人背后都有一个没用的男人");
    }
}
