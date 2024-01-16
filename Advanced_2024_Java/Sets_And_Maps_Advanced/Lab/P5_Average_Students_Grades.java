package Sets_And_Maps_Advanced.Lab;

import java.util.*;

public class P5_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<Double>> grades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if(!grades.containsKey(name)){
                grades.put(name,new ArrayList<>());
            }

            grades.get(name).add(grade);
        }

        for (String key : grades.keySet()){
            System.out.print(key + " -> ");
            double sum = 0;
            for (Double grade : grades.get(key)){
                System.out.printf("%.2f ",grade);
                sum += grade;
            }
            System.out.printf("(avg: %.2f)%n",sum / grades.get(key).size());
        }
    }
}
