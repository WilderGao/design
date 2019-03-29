package factory.abstracts;

/**
 * @author WilderGao
 * time 2019-03-24 20:26
 * motto : everything is no in vain
 * description
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new FemaleFactory();
        Animal cat = factory.createCat();
        cat.gender();
    }
}
