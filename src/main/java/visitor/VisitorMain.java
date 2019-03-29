package visitor;

import visitor.action.Amativeness;
import visitor.action.Failing;
import visitor.action.Success;
import visitor.role.Man;
import visitor.role.Woman;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：测试类
 * motto: All efforts are not in vain
 */
public class VisitorMain {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        //成功时候的反应
        Success success = new Success();
        structure.display(success);

        //失败时候的反应
        Failing failing = new Failing();
        structure.display(failing);

        //恋爱时候的反应
        Amativeness amativeness = new Amativeness();
        structure.display(amativeness);
    }

}
