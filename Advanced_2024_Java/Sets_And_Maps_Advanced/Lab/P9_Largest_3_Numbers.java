package Sets_And_Maps_Advanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P9_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1)).limit(3)
                .collect(Collectors.toList());

        for (int num : sorted){
            System.out.print(num + " ");
        }

    }
}
