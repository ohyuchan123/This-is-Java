package Grammer.Arrary;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public static void main(String[] args) {
        Integer[] arr = {4, 3, 2, 1, 0}; // Integer 배열을 사용합니다.

        // 오름차순 정렬
        Arrays.sort(arr); // 자기 자신 배열을 정렬 시킴 (정렬된 배열을 반환하는 것이 아니다)
        System.out.println(Arrays.toString(arr)); // [0,1,2,3,4]

        // 내림차순 정렬
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder()); // 배열을 내림차순으로 정렬할 때는 Collections 클래스의 reverseOrder() 함수를 사용
        System.out.println(Arrays.toString(arr)); // [4,3,2,1,0]
    }
}
