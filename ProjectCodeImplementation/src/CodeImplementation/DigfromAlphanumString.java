package CodeImplementation;

import java.util.Scanner;

public class DigfromAlphanumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str;
	      String numbers;	       
	      Scanner SC=new Scanner(System.in);	       
	      System.out.print("Enter string that contains numbers: ");
	      str=SC.nextLine();
	      numbers=str.replaceAll("[^0-9]", "");	       
	      System.out.println("Numbers are: " + numbers);
	}

}
