package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P4_Array_Rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int first = arr[0];

            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j +1];
            }
            arr[arr.length - 1] = first;
        }
        System.out.println(String.join(" ",Arrays.stream(arr).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
