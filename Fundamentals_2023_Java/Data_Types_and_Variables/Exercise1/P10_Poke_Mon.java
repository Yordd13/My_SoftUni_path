package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P10_Poke_Mon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        int originalN = n;
        int counter = 0;
        while(n >= m){
            n -= m;
            counter++;

            if(n * 2 == originalN && y != 0){
                    n /= y;
            }
        }

        System.out.println(n);
        System.out.println(counter);
    }
}
