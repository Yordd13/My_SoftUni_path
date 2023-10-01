package L4.Methods.Lab;

import java.util.Scanner;

public class P6_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int area = ReturnArea(height , width);
        System.out.println(area);

    }
    public static int ReturnArea (int height, int width){
        return height * width;
    }
}
