package L3.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P2_Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];
        int[] reverse = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        int num = 0;
        for (int i = n - 1; i >= 0 ; i--) {
            reverse[num] = numbers[i];
            num++;
        }

        System.out.println(String.join(" ",Arrays.stream(reverse).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
