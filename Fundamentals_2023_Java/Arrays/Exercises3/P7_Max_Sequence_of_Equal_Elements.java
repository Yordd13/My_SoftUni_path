package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P7_Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int longest = 0;
        int[] output = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            int streak = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if(currentNum == numbers[j]){
                    streak++;
                }
                else {
                    break;
                }
            }
            if(streak > longest){
                longest = streak;
                for (int j = 0; j <= streak; j++) {
                    output[j] = currentNum;
                }
            }
        }

        for (int i = 0; i <= longest; i++) {
             System.out.print(output[i] + " ");
        }
    }
}
