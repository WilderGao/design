package factory.simple.operate;

import factory.simple.Operation;

/**
 * @author Wilder Gao
 * time:2018/7/23
 * description：
 * motto: All efforts are not in vain
 */
public class OperateAdd extends Operation {

    @Override
    public double getResult() {
        double numOne = getNumOne();
        double numTwo = getNumTwo();

        double result = numOne + numTwo;
        return result;
    }
}
