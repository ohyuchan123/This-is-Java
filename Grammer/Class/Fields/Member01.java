package Grammer.Class.Fields;

public class Member01 {
    public static void main(String[] args) {
        System.out.println( Field.classVar ); // 클래스/스태틱 변수 참조

        Field myField1 = new Field();   // 인스턴스 생성

        System.out.println( myField1.instanceVar ); // 인스턴스 변수 참조

        System.out.println( myField1.method() ); // 메서드안의 지역변수 출력
    }
}
