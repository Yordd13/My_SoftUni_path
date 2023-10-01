package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P5_Top_Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            boolean condition = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if(currentNum <= numbers[j]){
                    condition = false;
                    break;
                }
            }
            if(condition){
                int last = 0;
                for (int j = i; j < numbers.length; j++) {
                    boolean condition1 = true;
                    int currentNum1 = numbers[j];
                    for (int k = j+1; k < numbers.length; k++) {
                        if(currentNum1 <= numbers[k]){
                            condition1 = false;
                        }

                    }
                    if(condition1) {
                        System.out.print(currentNum1 + " ");
                        last = numbers[j];
                    }
                }
                if(numbers[numbers.length -1] < last){
                    System.out.print(numbers[numbers.length-1] );
                }
                return;
            }
        }
    }
}
