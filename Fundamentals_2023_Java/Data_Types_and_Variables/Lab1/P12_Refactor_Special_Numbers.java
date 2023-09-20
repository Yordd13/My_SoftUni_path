package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P12_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            boolean condition = (sum == 5) || (sum == 7) || (sum == 11);

            if(condition){
                System.out.printf("%d -> True%n", i);
            }
            else System.out.printf("%d -> False%n", i);
        }

    }
}
