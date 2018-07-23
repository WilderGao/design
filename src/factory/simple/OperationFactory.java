package factory.simple;

import factory.simple.operate.OperateAdd;
import factory.simple.operate.OperateDiv;
import factory.simple.operate.OperateMul;
import factory.simple.operate.OperateSub;

/**
 * @author Wilder Gao
 * time:2018/7/23
 * description：
 * motto: All efforts are not in vain
 */
public class OperationFactory {
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
