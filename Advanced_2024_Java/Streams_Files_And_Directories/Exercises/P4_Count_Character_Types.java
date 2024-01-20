package Streams_Files_And_Directories.Exercises;

import java.io.FileInputStream;
import java.io.IOException;

public class P4_Count_Character_Types {
    public static void main(String[] args) {
        String path = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)){

            int oneByte = fileInputStream.read();

            int countV = 0;
            int countOthers = 0;
            int countMarks = 0;
            while (oneByte >= 0){
                char el = (char) oneByte;
                if(el == 'a' || el == 'e' || el == 'i' || el == 'o' || el == 'u'){
                    countV++;
                }
                else if(el == '.' || el == ',' || el == '?' || el == '!'){
                    countMarks++;
                }
                else if(el != 32 && el != 10 && el != 13)countOthers++;

                oneByte = fileInputStream.read();
            }
            System.out.printf("Vowels: %d%n", countV);
            System.out.printf("Other symbols: %d%n", countOthers);
            System.out.printf("Punctuation: %d%n", countMarks);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
