package Text_Processing.Exercises;

import java.util.Scanner;

public class P2_Character_Multiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        System.out.println(returnSum(words[0],words[1]));

    }
    public static int returnSum(String word1, String word2){
        int result = 0;

        for (int i = 0; i < Math.min(word1.length(),word2.length()); i++) {
            result += word1.charAt(i) * word2.charAt(i);
        }
        if(word1.length() > word2.length()){
            for (int i = word2.length(); i < word1.length(); i++) {
                result += word1.charAt(i);
            }
        }
        else {
            for (int i = word1.length(); i < word2.length(); i++) {
                result += word2.charAt(i);
            }
        }

        return result;
    }
}
