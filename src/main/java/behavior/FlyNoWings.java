package behavior;

public class FlyNoWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
