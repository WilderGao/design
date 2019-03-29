package memento;

/**
 * @author Wilder Gao
 * time:2018/7/13
 * description：角色状态存储箱
 * motto: All efforts are not in vain
 */
public class RoleStateMemento {
    /**
     * 分别对应生命值、攻击力、防御力
     */
    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
