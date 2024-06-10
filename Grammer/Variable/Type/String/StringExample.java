package Grammer.Variable.Type.String;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println("저의 이름은 "+name+"이며 직업은" + job +"입니다.");

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t작업";
        System.out.println(str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.");
    }
}
