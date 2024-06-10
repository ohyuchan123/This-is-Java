package Grammer.Variable.Type.Integer;

public class ByteExample {
    public static void main(String[] args) {
        //byte : -128 ~ 127 저장이 허용되는 범위

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; 컴파일 에러(Type mismatch : cannot convert from int to byte)

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

    }
}
