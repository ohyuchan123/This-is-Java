package Grammer.Inheritance.multiple_inheritance;

public class Duck {
    private FlyingAbility flyingAbility;
    private SwimmingAbility swimmingAbility;

    public Duck() {
        flyingAbility = new FlyingAbility();
        swimmingAbility = new SwimmingAbility();
    }

    public void fly() {
        flyingAbility.fly();
    }

    public void swim() {
        swimmingAbility.swim();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
