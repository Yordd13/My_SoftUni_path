package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P6_Equal_Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            int currentNum = numbers[i];

            for (int j = numbers.length - 1; j > i; j--) {
                sumLeft += numbers[j];
            }
            for (int j = 0; j < i; j++) {
                sumRight += numbers[j];
            }

            if(sumLeft == sumRight){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
