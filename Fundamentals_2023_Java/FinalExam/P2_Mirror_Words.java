package FInalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_Mirror_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([@#])(?<word1>[A-Za-z]{3,}+)\\1\\1(?<word2>[A-Za-z]{3,}+)\\1";

        Pattern pattern = Pattern.compile(regex);

        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);

        int counterAll = 0;
        List<String> words = new ArrayList<>();

        while (matcher.find()){
            counterAll++;

            if(checkBack(matcher.group("word1"),matcher.group("word2"))){
                words.add(matcher.group("word1") + " <=> " + matcher.group("word2"));
            }
        }

        if(counterAll == 0){
            System.out.printf("No word pairs found!%n");
        }
        else System.out.printf("%d word pairs found!%n",counterAll);

        if(words.isEmpty()){
            System.out.printf("No mirror words!");
        }
        else {
            System.out.printf("The mirror words are:%n%s", String.join(", ",words));
        }
    }

    public static boolean checkBack(String word1, String word2){

        boolean answer = true;
        int counter = 0;
        if(word1.length() != word2.length()){
            return false;
        }

        for (int i = word2.length() - 1; i >= 0 ; i--) {
            if(word2.charAt(i) != word1.charAt(counter)){
                return false;
            }
            counter++;
        }

        return answer;
    }

}
