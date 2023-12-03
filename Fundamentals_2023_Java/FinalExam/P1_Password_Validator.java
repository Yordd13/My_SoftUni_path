package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1_Password_Validator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Character> password = new ArrayList<>();
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            password.add(input.charAt(i));
        }

        while (true){
            String[] line = scan.nextLine().split(" ");
            if(line[0].equals("Complete")){
                break;
            }

            if(line[0].equals("Validation")){
                if(password.size() < 8){
                    System.out.println("Password must be at least 8 characters long!");
                }
                if(!checkConsists(password)){
                    System.out.println("Password must consist only of letters, digits and _!");
                }
                if(!containsUpper(password)){
                    System.out.println("Password must consist at least one uppercase letter!");
                }
                if(!containsLower(password)){
                    System.out.println("Password must consist at least one lowercase letter!");
                }
                if(!containsDigit(password)){
                    System.out.println("Password must consist at least one digit!");
                }
                continue;
            }


            if(line[1].equals("Upper")){
                int index = Integer.parseInt(line[2]);
                if(index < password.size() && index >=0) {
                    password.set(index, password.get(index).toString().toUpperCase().charAt(0));
                    printPass(password);
                }
            }
            else if(line[1].equals("Lower")){
                int index = Integer.parseInt(line[2]);
                if(index < password.size() && index >=0) {
                    password.set(index, password.get(index).toString().toLowerCase().charAt(0));
                    printPass(password);
                }
            }
            else if(line[0].equals("Insert")){
                int index = Integer.parseInt(line[1]);
                char letter = line[2].charAt(0);
                if(index < password.size() && index >=0){
                    password.add(index,letter);
                    printPass(password);
                }
            }
            else if(line[0].equals("Replace")){
                int valueGivenChar = line[1].charAt(0);
                int value = Integer.parseInt(line[2]);
                int sum1 = value + valueGivenChar;
                if(sum1 <= 0){
                    continue;
                }
                char letter = Character.toString(sum1).charAt(0);


                boolean condition = false;
                while (password.contains((char) valueGivenChar)){
                    int index1 = password.indexOf((char) valueGivenChar);
                    password.set(index1,letter);
                    condition = true;
                }
                if(condition){
                    printPass(password);
                }
            }
        }
    }
    public static void printPass(List<Character> password){
        for (Character pass : password) {
            System.out.print(pass);
        }
        System.out.print("\n");
    }

    public static boolean checkConsists(List<Character> password){
        boolean result = true;
        for (Character pass: password){
            result = (pass >= 48 && pass <= 57) || (pass >= 65 && pass <= 90) || (pass >= 97 && pass <= 122) || pass == '_';
            if(!result) break;
        }
        return result;
    }
    public static boolean containsUpper(List<Character> password){
        boolean result = false;
        for (Character pass: password){
            if(pass >= 65 && pass <= 90){
                result = true;
                break;
            }
        }
        return result;
    }
    public static boolean containsLower(List<Character> password){
        boolean result = false;
        for (Character pass: password){
            if(pass >= 97 && pass <= 122){
                result = true;
                break;
            }
        }
        return result;
    }
    public static boolean containsDigit(List<Character> password){
        boolean result = false;
        for (Character pass: password){
            if(pass >= 48 && pass <= 57){
                result = true;
                break;
            }
        }
        return result;
    }
}
