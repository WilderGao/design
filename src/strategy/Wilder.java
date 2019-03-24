package strategy;

/**
 * @author WilderGao
 * time 2019-03-24 20:45
 * motto : everything is no in vain
 * description
 */
public class Wilder {
    private RejectHandler rejectHandler;

    public Wilder(RejectHandler rejectHandler){
        this.rejectHandler = rejectHandler;
    }

    public void reject(){
        rejectHandler.method();
    }
}
