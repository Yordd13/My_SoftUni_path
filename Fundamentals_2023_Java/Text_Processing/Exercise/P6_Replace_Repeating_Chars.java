package Text_Processing.Exercises;

import java.util.Scanner;

public class P6_Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if(i == 0){
                output += input.charAt(0);
            }
            else{
                if(input.charAt(i) == input.charAt(i-1)){
                    continue;
                }
                else{
                    output += input.charAt(i);
                }
            }
        }
        System.out.println(output);
    }
}
