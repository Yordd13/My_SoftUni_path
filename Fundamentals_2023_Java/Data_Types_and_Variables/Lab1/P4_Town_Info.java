package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P4_Town_Info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        long population = Long.parseLong(scan.nextLine());
        long area = Long.parseLong(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", name, population, area);
    }
}
