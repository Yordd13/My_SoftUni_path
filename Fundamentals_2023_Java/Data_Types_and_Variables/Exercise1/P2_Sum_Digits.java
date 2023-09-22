package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P2_Sum_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int digits = String.valueOf(num).length();
        int sum = 0;
        while (digits > 0){
            sum += num % 10;
            num /= 10;

            digits--;
        }
        System.out.println(sum);
    }
}
