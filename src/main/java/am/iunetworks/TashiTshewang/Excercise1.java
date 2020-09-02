package am.iunetworks.TashiTshewang;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Excercise1 {
    public static void main(String[] args) throws IOException {
        File fread = new File("src\\main\\java\\am\\iunetworks\\TashiTshewang\\text.txt");
        File fwrite = new File("src\\main\\java\\am\\iunetworks\\TashiTshewang\\text1.txt");


        FileInputStream fis = new FileInputStream(fread);
        FileOutputStream fos = new FileOutputStream(fwrite);

        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        String wordLine;
        ArrayList<String> al = new ArrayList<String> ();
        int i = 0;
        while ((wordLine = bf.readLine()) != null) {
                al.add(wordLine);
                i++;
        }
        Collections.sort(al);
        //output sorted content to a file
        for (String s : al) {
            System.out.println(s);
            bw.write(s);
            bw.newLine();
            bw.write("-----------");
            bw.newLine();
        }

        bf.close();
        bw.close();
    }
}