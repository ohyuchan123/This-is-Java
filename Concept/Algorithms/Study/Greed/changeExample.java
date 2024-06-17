package Concept.Algorithms.Study;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class changeExample {
    public static void main(String[] args) {
        int[] change = {500,100,50,10};
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("거스름 돈 : ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<change.length;i++){
            count += n/change[i];
            n %= change[i];
        }
        System.out.println(count);

    }
}
