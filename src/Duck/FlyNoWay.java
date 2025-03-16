package Duck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly! I don't have wings");
    };
}
