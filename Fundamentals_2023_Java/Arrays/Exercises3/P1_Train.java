package L3.Arrays.Exercises;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class P1_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
            sum += numbers[i];
        }

        System.out.println(String.join(" ",Arrays.stream(numbers).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
        System.out.println(sum);
    }
}
