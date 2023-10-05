package L4.Methods.Exercise;

import java.util.Scanner;

public class P7_NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        getMatrix(n);
    }

    public static void getMatrix(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
