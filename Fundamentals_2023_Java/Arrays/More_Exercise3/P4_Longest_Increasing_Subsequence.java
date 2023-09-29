package L3.Arrays.More_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P4_Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int max = 0;
        int lastIndex = -1;
        int[] output = new int[numbers.length];
        int[] prev = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {

            output[i] = 1;
            prev[i] = -1;
            for (int k = 0; k < i; k++) {
                if(numbers[k] < numbers[i] && output[k] + 1 > output[i]){
                    output[i] = output[k] +1;
                    prev[i] = k;
                }
            }
            if(output[i] > max){
                max = output[i];
                lastIndex = i;
            }
        }
        int[] lis = new int[max];
        int currentIndex = max - 1;

        while(lastIndex != -1){

            lis[currentIndex] = numbers[lastIndex];
            currentIndex--;
            lastIndex = prev[lastIndex];
        }


        System.out.println(String.join(" ",Arrays.stream(lis).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
