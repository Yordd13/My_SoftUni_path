package FInalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_Destination_Mapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([=\\/])(?<name>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        List<String> destinations = new ArrayList<>();

        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);
        int sum = 0;


        while (matcher.find()){
            sum += matcher.group("name").length();
            destinations.add(matcher.group("name"));
        }

        System.out.printf("Destinations: %s%n",String.join(", ",destinations));
        System.out.printf("Travel Points: %d",sum);

    }
}
