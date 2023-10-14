package Lists.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7_Append_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(arrays);
        String output = arrays.toString().replaceAll("[\\]\\[,]", "").trim();
        output = output.replaceAll("\\s+"," ");
        System.out.println(output);

    }
}
