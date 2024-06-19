package Concept.Design_patterns.factory;

public class Test {
    public static void main(String[] args) {
        // 사용하는 쪽인 Test가 Car 클래스를 인지하고 있어야 합니다.
//        Car car = new Car();

        // Car 클래스를 몰라도 문자열로 필요한 객체를 얻을 수 있습니다.
        Transportation t = TransportationFactory.getTransportation("Air");
        t.move();

        Transportation t2 = TransportationFactory.getTransportation("Car");
        t2.move();
    }
}
