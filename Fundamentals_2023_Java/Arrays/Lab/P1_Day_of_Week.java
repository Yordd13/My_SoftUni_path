package L3.Arrays.Lab;

import java.util.Scanner;

public class P1_Day_of_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] days = new String[]{
          "Monday",
          "Tuesday",
          "Wednesday",
          "Thursday",
          "Friday",
          "Saturday",
          "Sunday"
        };

        int num = Integer.parseInt(scan.nextLine());

        if(num > 0 && num <= days.length){
            System.out.println(days[num - 1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
