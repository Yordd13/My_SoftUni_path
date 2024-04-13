package Exceptions_and_Error_Handling;

import java.util.Scanner;

public class P1_NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] range = scan.nextLine().split("\\s+");
        int startIndex = Integer.parseInt(range[0]);
        int endIndex = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]\n",startIndex,endIndex);

        boolean condition = false;

        while (true){

            String number = scan.nextLine();
            int num;

            try {
                num = Integer.parseInt(number);
                if(num >= startIndex && num <= endIndex){
                    condition = true;
                }
            }
            catch (RuntimeException ex){
                System.out.printf("Invalid number: %s\n",number);
                continue;
            }


            if(condition){
                System.out.printf("Valid number: %d",num);
                return;
            }
            else System.out.printf("Invalid number: %s\n",number);

        }
    }
}
