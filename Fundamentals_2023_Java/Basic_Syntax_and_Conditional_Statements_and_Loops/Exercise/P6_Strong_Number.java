package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P6_Strong_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        int sumDigitsFactorial = 0;
        for (int i = 0; i < num.length(); i++) {
            String digit = String.valueOf(num.charAt(i));
            int num1 = Integer.parseInt(digit);
            int sum = 1;
            for (int j = 1; j <= num1; j++) {
                sum *= j;
            }
            sumDigitsFactorial += sum;
        }

        if(sumDigitsFactorial == Integer.parseInt(num)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
