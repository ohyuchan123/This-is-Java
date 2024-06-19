package Concept.Design_patterns.builder.methodchain;

public class Person_test {
    public static void main(String[] args) {
        // 메소드 체이닝을 사용하여 Person 객체 생성 및 초기화
        Person person1 = new Person()
                .setHeight(180)
                .setWeight(75)
                .setResidence("Seoul");

        Person person2 = new Person()
                .setHeight(165)
                .setWeight(60)
                .setResidence("Busan");

        // Person 객체의 상태 출력
        System.out.println(person1);
        System.out.println(person2);
    }
}
