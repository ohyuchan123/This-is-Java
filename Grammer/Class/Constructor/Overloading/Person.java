package Grammer.Class.Constructor.Overloading;

public class Person {
    private String name;
    private int age;

    // 기본 생성자
    public Person() {
        this("Unknown", 0);
    }

    // 이름만 초기화하는 생성자
    public Person(String name) {
        this(name, 0);
    }

    // 이름과 나이를 초기화하는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

}
