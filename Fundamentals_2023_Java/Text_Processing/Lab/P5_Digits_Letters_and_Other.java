package Text_Processing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5_Digits_Letters_and_Other {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<String> output = new ArrayList<>();
        output.add(0,"");
        output.add(1,"");
        output.add(2,"");

        for (int i = 0; i < input.length(); i++) {
            String digit = String.valueOf(input.charAt(i));
            if(Character.isDigit(input.charAt(i))){
                output.set(0,output.get(0) + digit);
            }
            else if(Character.isLetter(input.charAt(i))){
                output.set(1,output.get(1) + digit);
            }
            else{
                output.set(2, output.get(2) + digit);
            }
        }

        for (String line: output) {
            System.out.println(line);
        }
    }
}
