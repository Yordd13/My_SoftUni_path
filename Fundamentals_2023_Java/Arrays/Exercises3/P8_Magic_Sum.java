package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P8_Magic_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == sum){
                    System.out.println(numbers[i] + " " +  numbers[j]);
                }
            }
        }
    }
}
