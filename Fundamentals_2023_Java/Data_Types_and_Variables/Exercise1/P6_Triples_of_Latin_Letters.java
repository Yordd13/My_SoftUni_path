package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P6_Triples_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 97; i < n + 97; i++) {
            for (int j = 97; j < n + 97; j++) {
                for (int k = 97; k < n + 97; k++) {
                    System.out.println(Character.toString(i) + Character.toString(j) + Character.toString(k));
                }
            }
        }
    }
}
