package obverser;

import obverser.obverser.NbaObserver;
import obverser.obverser.PlayObserver;
import obverser.subject.Secretary;

/**
 * @author Wilder Gao
 * time:2018/7/11
 * description：观察者模式测试类
 * motto: All efforts are not in vain
 */
public class ObserverMain {

    public static void main(String[] args) {
        //设置通知者
        Secretary secretary = new Secretary();
        secretary.setSubjectState("Wilder老板回来了");

        //观察者一
        NbaObserver nbaObserver = new NbaObserver("老高", secretary);
        System.out.println("老高在看NBA...");
        //观察者二
        PlayObserver playObserver = new PlayObserver("一休哥", secretary);
        System.out.println("一休哥在打机...");
        PlayObserver playObserverJim = new PlayObserver("吉哥", secretary);
        System.out.println("吉哥也打机，但是他和秘书关系不好");


        secretary.attach(nbaObserver);
        secretary.attach(playObserver);
        secretary.attach(playObserverJim);

        System.out.println("这时候老板来了...");
        secretary.detach(playObserverJim);

        //这时候老板来了
        secretary.notifyObserver();
        System.out.println("吉哥凉了...");


    }
}
