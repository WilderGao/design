package visitor;

import visitor.role.Man;
import visitor.role.Woman;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：访问者模式
 * motto: All efforts are not in vain
 */
public abstract class BaseAction {

    /**
     * 得到男人结构的反应
     * @param concreteElementA 男性类
     */
    public abstract void getManConclusion(Man concreteElementA);

    /**
     * 得到女人结构的反应
     * @param concreteElementB 女性类
     */
    public abstract void getWomanConclusion(Woman concreteElementB);

}
