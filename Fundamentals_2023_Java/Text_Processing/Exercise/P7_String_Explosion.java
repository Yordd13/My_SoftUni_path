package Text_Processing.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7_String_Explosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Character> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            result.add(symbol);

            if(symbol == '>'){
                i++;
                int bomb = input.charAt(i) - '0';

                int j = i;
                for (;j<i+bomb && j<input.length();j++){
                    if(input.charAt(j) == '>'){
                        result.add('>');
                        j++;
                        bomb += (input.charAt(j) - '0') + 1;
                    }
                }
                i = j-1;
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
    }
}
