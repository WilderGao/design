package factory.abstracts;

/**
 * @author WilderGao
 * time 2019-03-24 20:25
 * motto : everything is no in vain
 * description
 */
public class MaleFactory extends Factory {
    @Override
    Animal createCat() {
        return new MaleCat();
    }

    @Override
    Animal createDog() {
        return new MaleDog();
    }
}
