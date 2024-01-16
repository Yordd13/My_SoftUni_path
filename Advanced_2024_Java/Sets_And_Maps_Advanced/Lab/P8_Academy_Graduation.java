package Sets_And_Maps_Advanced.Lab;

import java.util.*;

public class P8_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numStudents = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        Map<String, double[]> studentData = new TreeMap<>();

        for (int i = 0; i < numStudents; i++) {
            String name = scan.nextLine();

            String[] scoreStrings = scan.nextLine().split(" ");
            double[] scores = new double[scoreStrings.length];

            for (int j = 0; j < scoreStrings.length; j++) {
                scores[j] = Double.parseDouble(scoreStrings[j]);
            }

            studentData.put(name, scores);
        }

        for (Map.Entry<String, double[]> entry : studentData.entrySet()) {
            String name = entry.getKey();
            double[] scores = entry.getValue();
            String averageScore = calculateAverage(scores);

            System.out.printf("%s is graduated with %s%n", name, averageScore);
        }
    }

    private static String calculateAverage(double[] scores) {
        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        double average = sum / scores.length;

        // Remove trailing zeros after the decimal point
        String formattedAverage = String.format("%.1000f", average).replaceAll("0*$", "");
        return formattedAverage;
    }
}
