package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            long snowballValue = (long) Math.pow(snowballSnow * 1.0/ snowballTime, snowballQuality);
            if(max < snowballValue){
                max = snowballValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow , maxTime , max , maxQuality);
    }
}
