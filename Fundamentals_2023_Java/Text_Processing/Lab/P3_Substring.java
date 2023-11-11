package Text_Processing.Lab;

import java.util.Scanner;

public class P3_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input1 = scan.nextLine();
        String input2 = scan.nextLine();

        for (int i = 0; i <= input2.length(); i++) {
            if(input2.contains(input1)){
                    input2 = input2.replace(input1,"");
                i = 0;
            }
            else break;
        }
        System.out.println(input2);
    }
}
