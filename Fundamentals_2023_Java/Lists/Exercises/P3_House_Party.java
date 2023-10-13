package Lists.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3_House_Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scan.nextLine().split(" ");
            if(input.length == 3){
                if(people.contains(input[0])){
                    System.out.printf("%s is already in the list!%n",input[0]);
                }
                else {
                    people.add(input[0]);
                }
            } else if (input.length == 4) {
                if(people.contains(input[0])){
                    people.remove(input[0]);
                }
                else{
                    System.out.printf("%s is not in the list!%n", input[0]);
                }
            }
        }
        for (String person : people) {
            System.out.println(person);
        }
    }
}
