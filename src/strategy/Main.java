package strategy;

/**
 * @author WilderGao
 * time 2019-03-24 20:51
 * motto : everything is no in vain
 * description
 */
public class Main {
    public static void main(String[] args) {
        Wilder wilderThrowAway = new Wilder(new ThrowAwayHandler());
        wilderThrowAway.reject();

        Wilder wilderThrowException = new Wilder(new ThrowExceptionHandler());
        wilderThrowException.reject();
    }
}
