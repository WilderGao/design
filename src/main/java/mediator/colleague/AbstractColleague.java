package mediator.colleague;

import mediator.mediator.AbstractMediator;

/**
 * @author wilder
 * @date 19-3-11 上午9:48
 * description
 */
public abstract class AbstractColleague {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //同事类一起改变，要求同事类A的数字永远是同事类B的100倍
    public abstract void setNumber(int number, AbstractMediator mediator);
}
