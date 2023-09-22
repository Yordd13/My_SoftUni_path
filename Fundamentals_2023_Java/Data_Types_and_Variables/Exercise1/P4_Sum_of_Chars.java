package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P4_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char letter = scan.nextLine().charAt(0);
            sum += letter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
