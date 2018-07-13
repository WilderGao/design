package memento;

/**
 * @author Wilder Gao
 * time:2018/7/13
 * description：角色类
 * motto: All efforts are not in vain
 */
public class Orginiator {
    private int vit;
    private int atk;
    private int def;

    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 初始状态
     */
    public void getInitState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * 被攻击后的状态
     */
    public void beAttackedState(){
        this.vit = 40;
        this.atk = 35;
        this.def = 30;
    }

    /**
     * 展示角色信息
     */
    public void stateDisplay(){
        System.out.println("角色的生命值为："+this.vit);
        System.out.println("角色的攻击力为："+this.atk);
        System.out.println("角色的防御力为："+this.def);
    }

    /**
     * 恢复角色信息
     * @param memento
     */
    public void recoveryState(RoleStateMemento memento){
        this.atk = memento.getAtk();
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }


}
