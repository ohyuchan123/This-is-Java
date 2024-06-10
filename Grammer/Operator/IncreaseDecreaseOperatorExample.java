package Grammer.Operator;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        // 증감연산자
        int x = 10;
        int y = 10;
        int z;


        x++;
        ++x;
        System.out.println("x= "+ x);

        System.out.println("-------------------");
        y--;
        --y;
        System.out.println("y= "+y);

        // 위와 같이 변수 단독으로 증감 연산자가 사용될 경우에는 변수의 앞뒤 어디에 붙어도 결과는 동일하다.

        System.out.println("-------------------");
        // 하지만 여러 개의 연산자가 포함되어 있는 연산식에서는 증감 연산자의 위치에 따라 결과가 달라진다.

        // 증감 연산자가 변수 뒤에 있으면 모든 연산을 끝낸 후에 변수를 1 증가 또는 1 감소시킨다.

        z = x++;
        System.out.println("z= "+z);
        System.out.println("x= "+ x);

        System.out.println("-------------------");
        // 증감 연산자는 변수 앞에 있으면 우선 변수를 1 증가 또는 1 감소시킨 후에 다른 연산을 수행한다.
        z = ++x;
        System.out.println("z= "+z);
        System.out.println("x= "+ x);

        System.out.println("-------------------");
        z = ++x + y ++;
        System.out.println("z= "+z);
        System.out.println("x= "+ x);
        System.out.println("y= "+y);

    }
}
