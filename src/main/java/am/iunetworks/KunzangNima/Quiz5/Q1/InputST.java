package am.iunetworks.KunzangNima.Quiz5.Q1;

import java.io.FileInputStream;
public class InputST {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            int i=fin.read();
            System.out.print((char)i);
            System.out.println("Kunzang Nima is testing git commands");
            System.out.println("Checking");

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}