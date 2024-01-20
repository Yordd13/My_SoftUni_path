package Streams_Files_And_Directories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P2_Write_to_File {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";
        String outputPath = "C:\\Users\\yordd\\OneDrive\\Работен плот\\Problem2.txt";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath)){
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

            int oneBite = fileInputStream.read();
            while (oneBite >= 0){
                char el = (char) oneBite;
                if(el != '.' && el != ',' && el != '!' && el != '?'){
                    fileOutputStream.write(oneBite);
                }
                oneBite = fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
