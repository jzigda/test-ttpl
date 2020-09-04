package week5;

import java.util.Scanner;

public class Question5 {

	public static void ToLowerCase(String s) {
		char str[]=s.toCharArray();
	     for(int i=0;i<str.length;i++)
	     {
	         if(str[i]>='A' && str[i]<='Z')
	         { 
	         str[i]=(char)((int)str[i]+32);
	         }
	     }
	     System.out.println("The string in LowerCase is");
	 for(int i=0;i<str.length;i++)
	     System.out.print(str[i]);
	 }
	public static void main(String args[])
	 {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter any string which is to be converted to lowercase: ");
	 String string =input.nextLine();
	 ToLowerCase(string);
	}
}
