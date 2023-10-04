package L4.Methods.Exercise;

import java.util.Scanner;

public class P2_Vowels_Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        getCountVowels(input);
    }

    public static void getCountVowels(String word){
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);

            if(curr == 'a' || curr == 'e' || curr == 'u' || curr == 'i' || curr == 'o'
            || curr == 'A' || curr == 'E' || curr == 'U' || curr == 'I' || curr == 'O'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
