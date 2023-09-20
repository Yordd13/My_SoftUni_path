package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P10_Special_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int digits = String.valueOf(i).length();
            int number = i;
            int sumDigits = 0;
            while(digits > 0){
                sumDigits += number % 10;

                number /= 10;
                digits--;
            }

            if(sumDigits == 5 || sumDigits == 7 || sumDigits == 11){
                System.out.printf("%d -> True%n", i);
            }
            else System.out.printf("%d -> False%n", i);
        }
    }
}
