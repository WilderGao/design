package factory.simple;

import factory.simple.operate.OperateAdd;
import factory.simple.operate.OperateDiv;
import factory.simple.operate.OperateMul;
import factory.simple.operate.OperateSub;

/**
 * @author Wilder Gao
 * time:2018/7/23
 * description：简单工厂模式，通过操作符来返回对应的工厂
 * motto: All efforts are not in vain
 */
public class OperationFactory {
    /**
     * 简单工厂的缺点就是如果有新的需求加进来就需要修改代码，影响了原来的类
     * @param operate
     * @return
     */
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperateAdd();
                break;
            case "-":
                operation = new OperateSub();
                break;
            case "*":
                operation = new OperateMul();
                break;
            case "/":
                operation = new OperateDiv();
                break;
            default:
                break;
        }
        return operation;
    }
}
