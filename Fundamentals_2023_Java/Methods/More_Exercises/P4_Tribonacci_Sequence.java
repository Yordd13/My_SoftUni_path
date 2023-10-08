package L4.Methods.More_Exercise;

import java.util.Scanner;

public class P4_Tribonacci_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = Integer.parseInt(scan.nextLine());

        returnSequence(counter);
    }

    public static void returnSequence(int times){
        int[] arr = new int[times];

        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == 1){
                arr[i] = 1;
            }
            else if(i == 2){
                arr[i] = arr[i-1] + arr[i-2];
            }
            else arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
