package Sets_And_Maps_Advanced.Exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P3_Periodic_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String[] input = line.split("\\s+");

            Collections.addAll(set, input);

        }

        for (String chemical : set) {
            System.out.print(chemical + " ");
        }
    }
}
