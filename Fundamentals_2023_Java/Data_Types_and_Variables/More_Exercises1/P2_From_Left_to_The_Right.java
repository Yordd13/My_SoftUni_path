package L2.Data_Types_and_Variables.More_exercise;

import java.util.Scanner;

public class P2_From_Left_to_The_Right {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String firstNum = "";
            String secondNum = "";

            boolean blankGone = false;
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == ' '){
                    blankGone = true;
                    continue;
                }

                if(blankGone){
                    secondNum += input.charAt(j);
                }
                else firstNum += input.charAt(j);

            }

            long num1 = Long.parseLong(firstNum);
            long num2 = Long.parseLong(secondNum);

            int sum = 0;
            if(num1 > num2){
                int digits = String.valueOf(num1).length();
                while(digits>0){
                    sum+=num1 %10;
                    num1 /= 10;
                    digits--;
                }
            }
            else {
                int digits = String.valueOf(num2).length();
                while(digits > 0){
                    sum+=num2 %10;
                    num2 /= 10;
                    digits--;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
