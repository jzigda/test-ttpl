package am.iunetworks.KunzangNima.Quiz5;

import java.io.*;
import java.util.Arrays;

public class InputST {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("src\\main\\java\\am\\iunetworks\\KunzangNima\\Quiz5\\Q1\\InputFile.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}