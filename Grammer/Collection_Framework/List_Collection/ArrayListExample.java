package Grammer.Collection_Framework.List_Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int test = 12345;

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (test>0){
            arrayList.add(test%10);
            test/=10;
        }
        System.out.println(arrayList);
    }
}
