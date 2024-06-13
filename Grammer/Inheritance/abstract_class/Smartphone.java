package Grammer.Inheritance.abstract_class;

public class Smartphone extends Phone{
    // 생성자 선언
    Smartphone(String owner){
        // Phone 생성자 호출
        super(owner);
    }

    // 메소드 선언
    void internetSearch(){
        System.out.println("인터넷을 검색합니다.");
    }
}
