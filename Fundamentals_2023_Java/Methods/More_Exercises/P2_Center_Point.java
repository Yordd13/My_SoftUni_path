package L4.Methods.More_Exercise;

import java.util.Scanner;

public class P2_Center_Point {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());

        returnPoint(x1,y1,x2,y2);
    }
    public static void returnPoint(int x1, int y1, int x2, int y2){
        double d1 = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
        double d2 = Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2));

        if(d1 < d2){
            System.out.printf("(%d, %d)", x1, y1);
        }
        else System.out.printf("(%d, %d)", x2, y2);
    }
}
