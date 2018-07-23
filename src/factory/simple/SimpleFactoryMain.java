package factory.simple;

/**
 * @author Wilder Gao
 * time:2018/7/23
 * description：
 * motto: All efforts are not in vain
 */
public class SimpleFactoryMain {
    public static void main(String[] args) throws Exception {
        Operation operationAdd = OperationFactory.createOperate("+");
        operationAdd.setNumOne(1);
        operationAdd.setNumTwo(2);

        System.out.println("运行结果为："+ operationAdd.getResult());

        Operation operationSub = OperationFactory.createOperate("/");
        operationSub.setNumTwo(3);
        operationSub.setNumOne(2);
        System.out.println("运行结果为： "+operationSub.getResult());
    }
}
