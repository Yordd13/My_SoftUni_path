package Sets_And_Maps_Advanced.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P1_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> set = new LinkedHashSet<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            set.add(scan.nextLine());
        }

        for (String unique : set) {
            System.out.println(unique);
        }
    }
}
