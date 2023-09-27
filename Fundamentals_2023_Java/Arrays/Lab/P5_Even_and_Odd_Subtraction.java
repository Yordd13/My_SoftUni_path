package L3.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P5_Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < input.length; i++) {
            if(input[i] % 2 == 0){
                sumEven += input[i];
            }
            else sumOdd += input[i];
        }
        System.out.println(sumEven - sumOdd);
    }
}
