package ducks;

import behavior.FlyNoWings;
import behavior.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWings();
    }

    @Override
    public void display() {
        System.out.println("I'am real Rubber duck");
    }
}
