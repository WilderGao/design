package memento;

/**
 * @author Wilder Gao
 * time:2018/7/13
 * description：角色管理者
 * motto: All efforts are not in vain
 */
public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
