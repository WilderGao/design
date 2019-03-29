package mediator;

import mediator.colleague.AbstractColleague;
import mediator.colleague.ColleagueA;
import mediator.colleague.ColleagueB;
import mediator.mediator.AbstractMediator;
import mediator.mediator.Mediator;

/**
 * @author wilder
 * @date 19-3-11 上午10:06
 * description
 */
public class Client {
    public static void main(String[] args) {
        AbstractColleague colleagueA = new ColleagueA();
        AbstractColleague colleagueB = new ColleagueB();

        AbstractMediator mediator = new Mediator(colleagueA, colleagueB);
        System.out.println("======= 通过A影响B ======");
        colleagueA.setNumber(1000, mediator);
        System.out.println("colleagueA的值： "+colleagueA.getNumber());
        System.out.println("colleagueB的值： "+colleagueB.getNumber());

        System.out.println("====== 通过B影响A ======");
        colleagueB.setNumber(1000, mediator);
        System.out.println("colleagueA的值： "+colleagueA.getNumber());
        System.out.println("colleagueB的值： "+colleagueB.getNumber());
    }
}
