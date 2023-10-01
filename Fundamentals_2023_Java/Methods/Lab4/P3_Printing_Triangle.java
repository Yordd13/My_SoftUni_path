package L4.Methods.Lab;

import java.util.Scanner;

public class P3_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            ReturnTriangle(1,i);
        }
        for (int i = n -1; i > 0; i--) {
            ReturnTriangle(1, i);
        }

    }

    public static void ReturnTriangle(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
