package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P3_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] curr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            if(i % 2 == 0){
                arr1[i] = curr[0];
                arr2[i] = curr[1];
            }
            else {
                arr1[i] = curr[1];
                arr2[i] = curr[0];
            }
        }

        System.out.println(String.join(" ",Arrays.stream(arr1).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
        System.out.println(String.join(" ",Arrays.stream(arr2).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
