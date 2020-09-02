package am.iunetworks.DorjiNorbu.questionOne;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Dorji Norbu on 02-Sep-20.
 */
public class QuestionOne {
    public static void main(String[] args) throws IOException{
        try {
            FileReader fileReader= new FileReader("../questionOne.txt");
            int i;
            while((i=fileReader.read())!=-1){
                System.out.println((char)i);
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("here");
        }
    }
}
