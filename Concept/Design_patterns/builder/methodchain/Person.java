package Concept.Design_patterns.builder.methodchain;

public class Person {
    private int height;
    private int weight;
    private String residence;

    // height 설정 메소드
    public Person setHeight(int height) {
        this.height = height;
        return this; // 메소드 체이닝을 위해 객체 자신을 반환
    }

    // weight 설정 메소드
    public Person setWeight(int weight) {
        this.weight = weight;
        return this; // 메소드 체이닝을 위해 객체 자신을 반환
    }

    // residence 설정 메소드
    public Person setResidence(String residence) {
        this.residence = residence;
        return this; // 메소드 체이닝을 위해 객체 자신을 반환
    }

    @Override
    public String toString() {
        return "Person [height=" + height + ", weight=" + weight + ", residence=" + residence + "]";
    }
}

