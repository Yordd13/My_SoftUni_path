package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_Message_Translator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String regex = "!(?<command>[A-Z][a-z]{2,}+)!:\\[(?<input>[A-Za-z]{8,}+)\\]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            Matcher matcher = pattern.matcher(line);

            if(matcher.find()){
                System.out.printf("%s: %s%n",matcher.group("command"),getCodes(matcher.group("input")));
            }
            else{
                System.out.println("The message is invalid");
            }
        }
    }

    public static String getCodes(String input){
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int current = letter;
            if(i != input.length() - 1){
                result += current + " ";
            }
            else result += current + "";
        }

        return result;
    }
}
