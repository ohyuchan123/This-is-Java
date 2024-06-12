package Grammer.Class.Constructor.Overloading;

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();

        Person person2 = new Person("Alice");
        person2.displayInfo();

        Person person3 = new Person("Bob", 25);
        person3.displayInfo();
    }
}
