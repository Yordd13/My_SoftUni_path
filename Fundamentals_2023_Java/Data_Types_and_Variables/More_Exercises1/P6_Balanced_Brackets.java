package L2.Data_Types_and_Variables.More_exercise;

import java.util.Scanner;

public class P6_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int counterLeft = 0;
        int counterRight = 0;

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            if(input.equals("(")){
                counterLeft++;
            } else if (input.equals(")")) {
                counterRight++;
            }

            if(counterRight>counterLeft || counterLeft + 2 == counterRight + 4){
                System.out.println("UNBALANCED");
                return;
            }

        }
        if(counterRight != counterLeft){
            System.out.println("UNBALANCED");
        }
        else System.out.println("BALANCED");
    }
}
