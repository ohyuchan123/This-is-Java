package Concept.Design_patterns.factory;

public class SportCar implements Transportation {
    @Override
    public void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}
