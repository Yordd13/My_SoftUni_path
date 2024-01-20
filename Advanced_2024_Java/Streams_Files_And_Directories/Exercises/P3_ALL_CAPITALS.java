package Streams_Files_And_Directories.Exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P3_ALL_CAPITALS {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";
        String pathOut = "C:\\Users\\yordd\\OneDrive\\Работен плот\\Output.txt";

        try (FileInputStream fileInputStream = new FileInputStream(pathIn)){
            FileOutputStream outputStream = new FileOutputStream(pathOut);

            int oneByte = fileInputStream.read();
            while (oneByte >= 0){
                if(oneByte >= 97 && oneByte <= 122){
                    oneByte -= 32;
                }
                outputStream.write(oneByte);

                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
