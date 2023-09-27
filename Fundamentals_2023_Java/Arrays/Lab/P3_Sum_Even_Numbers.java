package L3.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P3_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] % 2 == 0){
                sum += input[i];
            }
        }
        System.out.println(sum);
    }
}
