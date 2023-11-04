package Associative_Arrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P6_Student_Academy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,Double> gradeSum = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> countGrades = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if(!gradeSum.containsKey(name)){
                gradeSum.put(name,0.0);
                countGrades.put(name,0);
            }

            gradeSum.put(name,gradeSum.get(name) + grade);
            countGrades.put(name,countGrades.get(name) + 1);
        }

        for (Map.Entry<String,Double> kvp : gradeSum.entrySet()){
            if(kvp.getValue() / countGrades.get(kvp.getKey()) >= 4.50) {
                System.out.printf("%s -> %.2f%n", kvp.getKey(), kvp.getValue() / countGrades.get(kvp.getKey()));
            }
        }
    }
}
