package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P9_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yield = Integer.parseInt(scan.nextLine());

        int collected = 0;
        int days = 0;
        while(yield > 99){
            collected += yield - 26;
            days++;
            yield -= 10;
        }

        if(collected > 26){
            collected -= 26;
        }
        System.out.println(days);
        System.out.println(collected);
    }
}
