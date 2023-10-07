package L4.Methods.More_Exercise;

import java.util.Scanner;

public class P3_Longer_Line {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());
        int x3 = Integer.parseInt(scan.nextLine());
        int y3 = Integer.parseInt(scan.nextLine());
        int x4 = Integer.parseInt(scan.nextLine());
        int y4 = Integer.parseInt(scan.nextLine());

        returnLongerLine(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    public static double returnPointLength(int x1, int y1, int x2, int y2){
        double d1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        return d1;
    }

    public static void returnLongerLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        double line1 = returnPointLength(x1,y1,x2,y2);
        double line2 = returnPointLength(x3,y3,x4,y4);

        if(line1 >= line2){
            if(returnPointLength(x1,y1,0,0) < returnPointLength(x2,y2,0,0)){
                System.out.printf("(%d, %d)(%d, %d)", x1, y1,x2,y2);
            }
            else System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
        else {
            if(returnPointLength(x3,y3,0,0) < returnPointLength(x4,y4,0,0)){
                System.out.printf("(%d, %d)(%d, %d)", x3, y3,x4,y4);
            }
            else System.out.printf("(%d, %d)(%d, %d)", x4, y4,x3,y3);
        }
    }
}
