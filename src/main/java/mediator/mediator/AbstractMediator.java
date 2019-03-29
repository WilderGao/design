package mediator.mediator;

import mediator.colleague.AbstractColleague;


/**
 * @author wilder
 * @date 19-3-11 上午9:44
 * description 中介者模式，抽象中介者
 */
public abstract class AbstractMediator {
    protected AbstractColleague colleagueA;
    protected AbstractColleague colleagueB;

    public AbstractMediator(AbstractColleague a, AbstractColleague b){
        colleagueA = a;
        colleagueB = b;
    }

    public abstract void AeffectB();

    public abstract void BeffectA();
}
