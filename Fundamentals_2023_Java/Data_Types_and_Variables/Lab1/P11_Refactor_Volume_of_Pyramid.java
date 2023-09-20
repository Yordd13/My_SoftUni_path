package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P11_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
         double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("Pyramid Volume: %.2f", (length * width * height)/3);

    }
}
