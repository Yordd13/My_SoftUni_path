package Sets_And_Maps_Advanced.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P2_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i <n + m ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if(i < n){
                set1.add(num);
            }
            else {
                set2.add(num);
            }
        }

        for (Integer num : set1) {
            if(set2.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}
