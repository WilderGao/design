package factory.simple.operate;

import factory.simple.Operation;

/**
 * @author Wilder Gao
 * time:2018/7/23
 * description：
 * motto: All efforts are not in vain
 */
public class OperateDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        double numOne = getNumOne();
        double numTwo = getNumTwo();

        if (numTwo != 0){
            return numOne / numTwo;
        }else {
            throw new Exception("除数不能为0");
        }

    }
}
