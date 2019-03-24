package factory.abstracts;

/**
 * @author WilderGao
 * time 2019-03-24 20:17
 * motto : everything is no in vain
 * description
 */
public abstract class Factory {
    /**
     * 养猫
     */
    abstract Animal createCat();

    /**
     * 养狗
     */
    abstract Animal createDog();
}
