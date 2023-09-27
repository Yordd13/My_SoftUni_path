package L3.Arrays.More_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P1_Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] input = new String[n];

        int[] sumOutput = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextLine();
            int sum = 0;
            for (int j = 0; j < input[i].length(); j++) {
                char letter = input[i].charAt(j);

                if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'|| letter == 'u' || letter == 'U' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O'){
                    sum += (int) letter * input[i].length();
                }
                else sum += (int) letter / input[i].length();
            }
            sumOutput[i] = sum;
        }

        Arrays.sort(sumOutput);
        for (int i = 0; i < n; i++) {
            System.out.println(sumOutput[i]);
        }
    }
}
