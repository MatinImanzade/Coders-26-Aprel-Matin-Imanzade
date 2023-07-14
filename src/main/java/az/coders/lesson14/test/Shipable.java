package az.coders.lesson14.test;

public interface Shipable<T> {
    void ship(T t);
}

class ShipableRobot implements Shipable<Robot>{

    @Override
    public void ship(Robot robot) {
        System.out.println("Robot Ship");
    }
}

class ShibableAbstarct<U> implements Shipable<U>{

    @Override
    public void ship(U u) {
        System.out.println("Abstarct Crate Ship");
    }
}

class ShipableCrate implements Shipable{

    @Override
    public void ship(Object o) {

    }
}
