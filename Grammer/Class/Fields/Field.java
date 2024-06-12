package Grammer.Class.Fields;

public class Field {
    static int classVar = 10; // 클래스/스태틱 변수 선언
    int instanceVar = 20;     // 인스턴스 변수 선언

    int method() {
        int localVar = 30; // 지역 변수 선언
        return localVar;
    }
}
