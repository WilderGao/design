package mediator.colleague;

import mediator.mediator.AbstractMediator;

/**
 * @author wilder
 * @date 19-3-11 上午9:53
 * description
 */
public class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator mediator) {
        this.number = number;
        mediator.BeffectA();
    }
}
