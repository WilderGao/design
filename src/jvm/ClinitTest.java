package jvm;

/**
 * @author Wilder Gao
 * time:2018/7/20
 * description：
 * motto: All efforts are not in vain
 */
public class ClinitTest {
    public static void main(String[] args) {
        EnclosingOne one = new EnclosingOne();
        EnclosingOne.InsideOne insideOne = one.new InsideOne();
        EnclosingOne.InsideTwo insideTwo = new EnclosingOne.InsideTwo();
    }

}

class EnclosingOne{
    public class InsideOne{}
    public static class InsideTwo{}
}