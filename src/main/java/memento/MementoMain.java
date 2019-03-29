package memento;

/**
 * @author Wilder Gao
 * time:2018/7/13
 * description：备忘录模式测试代码
 * motto: All efforts are not in vain
 */
public class MementoMain {
    public static void main(String[] args) {
        //先创建一个角色吧
        System.out.println("刚创建角色......");
        Orginiator orginiator = new Orginiator();
        orginiator.getInitState();
        orginiator.stateDisplay();

        //管理人员保存
        System.out.println("角色记录已经保存......");
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(orginiator.saveState());
        RoleStateMemento memento = caretaker.getMemento();

        //怪物来了
        System.out.println("这时候怪物boss来了......");
        System.out.println("角色遭到了攻击......");
        orginiator.beAttackedState();
        orginiator.stateDisplay();

        //不服气准备重新读取
        System.out.println("不服气，恢复保存的状态重新来过......");
        orginiator.recoveryState(memento);
        orginiator.stateDisplay();


    }

}
