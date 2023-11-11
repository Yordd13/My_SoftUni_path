package Text_Processing.Lab;

import java.util.Scanner;

public class P1_Reverse_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String line = scan.nextLine();

            if(line.equals("end")){
                break;
            }

            String reverse = "";

            for(int i = line.length() - 1; i >= 0; i--){
                reverse += line.charAt(i);
            }

            System.out.printf("%s = %s%n",line, reverse);
        }
    }
}
