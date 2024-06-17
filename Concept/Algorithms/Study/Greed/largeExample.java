package Concept.Algorithms.Study;

import java.util.Arrays;
import java.util.Scanner;

public class largeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i< n;i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int first = arr[n-1];
        int second = arr[n-2];
        int result = 0;

        while (true){
            for(int i=0;i<k;i++){
                if(m==0) break;
                result += first; // k번 만큼 첫 번째 수를 더합니다/
                m -=1; // 한번 첫 번째 수를 더할 때 마다 m의 반복의 수를 줄입니다.
            }
            if(m==0) break; // 만약 m 반복 수가 0이면 종료합니다.
            result += second; // m==0 이 아니면 두번째 수를 더합니다.
            m -=1; // m의 반복 수를 줄입니다.
        }
        System.out.println(result);
    }
}
