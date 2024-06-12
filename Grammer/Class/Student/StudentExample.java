package Grammer.Class.Student;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("S1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
