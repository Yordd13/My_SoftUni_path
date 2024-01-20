package Streams_Files_And_Directories.Exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P5_Line_Numbers {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\yordd\\OneDrive\\Работен плот\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\yordd\\OneDrive\\Работен плот\\Output.txt";

        try (FileInputStream fileInputStream = new FileInputStream(pathIn)){
            FileOutputStream fileOutputStream = new FileOutputStream(pathOut);

            int counter = 1;
            int oneByte = fileInputStream.read();
            fileOutputStream.write(String.valueOf(counter).charAt(0));
            fileOutputStream.write('.');
            fileOutputStream.write(' ');

            while (oneByte >= 0){
                fileOutputStream.write(oneByte);
                if(oneByte == 10){
                    counter++;
                    fileOutputStream.write(String.valueOf(counter).charAt(0));
                    fileOutputStream.write('.');
                    fileOutputStream.write(' ');
                }
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
