package L3.Arrays.Exercises;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class P10_The_Lift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());

        int[] positions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < positions.length; i++) {
            if(positions[i] == 4){
                continue;
            }
            else {
                int diff = 4 - positions[i];
                if(diff > people){
                    positions[i] += people;
                    System.out.println("The lift has empty spots!");
                    System.out.println(String.join(" ", Arrays.stream(positions).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
                    return;
                }
                else {
                    positions[i] += diff;
                    people -= diff;
                }
            }
        }
        if(people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            System.out.println(String.join(" ", Arrays.stream(positions).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
        }
        else System.out.println(String.join(" ", Arrays.stream(positions).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
