package Grammer.Arrary;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};

        int[] arr2 = new int[arr1.length * 2]; // 우선 초기 배열보다 길이가 두배인 새로운 배열을 선언


        // 루프문으로 순회하여 복사
        for(int i = 0 ; i < arr1.length ; i++) { // arr1의 길이만큼 반복문 실행
            arr2[i] = arr1[i];	// arr1배열의 원소값을 순회하며 arr2배열에 저장
        }

        // 배열 항목 출력
        System.out.println(Arrays.toString(arr2));
    }
}
