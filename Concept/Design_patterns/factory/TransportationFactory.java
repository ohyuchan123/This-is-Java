package Concept.Design_patterns.factory;

// XXXFactory 보통 Singleton으로 구성
public class TransportationFactory {
    public static Transportation getTransportation(String clsf){
        Transportation t = null;
        switch (clsf){
            case "Air" : t = new Ariplane(); break;
            case "Car" : t = new Car(); break;
        }
        return t;
    }
}
