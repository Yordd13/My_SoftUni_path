package L4.Methods.Exercise;

import java.util.Scanner;

public class P9_Palindrome_Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!input.equals("END")){
            int current = Integer.parseInt(input);
            palindromeCheck(current);

            input = scan.nextLine();
        }

    }
    public static void palindromeCheck(int num){
        String second = "";
        int first = num;

        for (int i = String.valueOf(num).length(); i > 0 ; i--) {
            second += num %10;
            num /= 10;
        }
        if(Integer.parseInt(second) == first) System.out.println("true");
        else System.out.println("false");
    }
}
