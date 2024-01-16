package Sets_And_Maps_Advanced.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P2_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String input = scan.nextLine();

        while (!input.equals("PARTY")){
            guests.add(input);
            input = scan.nextLine();
        }

        input = scan.nextLine();
        while (!input.equals("END")){
            guests.remove(input);

            input = scan.nextLine();
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
