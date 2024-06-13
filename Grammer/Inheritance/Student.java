package Grammer.Inheritance;

public class Student extends Person{
    void print(){
        System.out.println("나의 이름은 " + super.name + "이고" + super.age+"살 입니다.");
    }
}
