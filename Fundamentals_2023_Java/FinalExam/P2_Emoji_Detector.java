package FInalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_Emoji_Detector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([*:])\\1(?<name>[A-Z][a-z]{2,}+)\\1\\1";
        Pattern pattern = Pattern.compile(regex);
        List<String> emojis = new ArrayList<>();

        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);


        String regex1 = "(?<digit>\\d)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(input);
        long threshold = 1;
        while (matcher1.find()){
            threshold *= Long.parseLong(matcher1.group("digit"));
        }

        int counter = 0;
        while (matcher.find()){
            counter++;
            if(getValue(matcher.group("name")) > threshold){
                emojis.add(matcher.group());
            }

        }

        System.out.printf("Cool threshold: %d%n",threshold);

        System.out.printf("%d emojis found in the text. The cool ones are:%n",counter);
        emojis.forEach(System.out::println);

    }

    public static long getValue(String word){
        long sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)!=':' && word.charAt(i) != '*'){
                sum += word.charAt(i);
            }
        }

        return sum;
    }

}
