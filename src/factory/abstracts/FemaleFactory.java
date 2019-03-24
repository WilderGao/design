package factory.abstracts;

/**
 * @author WilderGao
 * time 2019-03-24 20:19
 * motto : everything is no in vain
 * description 公动物
 */
public class FemaleFactory extends Factory {
    @Override
    public Animal createCat() {
        return new FemaleCat();
    }

    @Override
    public Animal createDog() {
        return new FemaleDog();
    }
}
