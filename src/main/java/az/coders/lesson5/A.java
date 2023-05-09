package az.coders.lesson5;

import java.util.Random;

public class A {

    public int randomInt(int bound){
        return new Random().nextInt(10);
    }

    public Integer randomInt(Integer integer){
        return new Random().nextInt(10);
    }

    public Number randomInt(Number number){
        return new Random().nextInt(10);
    }
}
