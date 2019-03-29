package mediator.mediator;

import mediator.colleague.AbstractColleague;

/**
 * @author wilder
 * @date 19-3-11 上午10:01
 * description
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    @Override
    public void AeffectB() {
        int number = colleagueA.getNumber();
        colleagueB.setNumber(number / 100);
    }

    @Override
    public void BeffectA() {
        int number = colleagueB.getNumber();
        colleagueA.setNumber(number * 100);
    }
}
