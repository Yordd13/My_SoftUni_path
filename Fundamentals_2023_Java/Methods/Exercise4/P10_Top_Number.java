package L4.Methods.Exercise;

import java.util.Scanner;

public class P10_Top_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++) {
            if(sumIsDivisibleByEight(i) && hasOneOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean sumIsDivisibleByEight(int number) {
        int sum = 0;
        String numberAsString = "" + number;
        for (int i = 0; i < numberAsString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
            sum += currentDigit;
        }
        return sum % 8 == 0;
    }

    private static boolean hasOneOddDigit(int number) {
        String numberAsString = "" + number;
        for (int i = 0; i < numberAsString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
            if (currentDigit % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
