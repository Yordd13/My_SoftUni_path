package Text_Processing.Exercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P3_Extract_File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(Pattern.quote("\\"));

        String[] output = input[input.length-1].split(Pattern.quote("."));
        System.out.printf("File name: %s%n",output[0]);
        System.out.printf("File extension: %s%n",output[1]);
    }
}
