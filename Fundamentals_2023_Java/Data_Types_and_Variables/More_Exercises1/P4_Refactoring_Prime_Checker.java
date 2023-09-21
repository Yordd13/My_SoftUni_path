package L2.Data_Types_and_Variables.More_exercise;

import java.util.Scanner;

public class P4_Refactoring_Prime_Checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= n; i++) {
            boolean output = true;
            for (int j = 2; j < n ; j++) {
                if(i % j == 0 && i != j){
                    output = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, output);
        }
    }
}
