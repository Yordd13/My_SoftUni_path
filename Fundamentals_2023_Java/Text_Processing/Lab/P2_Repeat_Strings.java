package Text_Processing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Repeat_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        List<String> output = new ArrayList<>();

        for (String word: input) {
            output.add(repeat(word,word.length()));
        }

        System.out.println(String.join("",output.stream().map(String::valueOf).collect(Collectors.toList())));
    }
    public static String repeat(String word, int times){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += word;
        }
        return result;
    }
}
