package L3.Arrays.More_Exercises;

import java.util.Scanner;

public class P3_Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        long[] fibonacci = new long[n];

        for (int i = 0; i < n; i++) {
            if(i < 2){
                fibonacci[i] = 1;
            }
            else fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        System.out.println(fibonacci[n-1]);
    }
}
