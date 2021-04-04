package ducks;

import behavior.FlyNoWings;
import behavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWings();
    }

    @Override
    public void display() {
        System.out.println("I'am model duck");
    }
}