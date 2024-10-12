package CodeImplementation;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args) 
	 {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence=sc.nextLine();
		
	    String revsen = reverse(sentence);
	    System.out.println("Reversed format: " + revsen);
	  }
	  public static String reverse(String sentence) 
	  {
	    if (sentence.isEmpty())
	    {
	      return sentence;
	    }
	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }
}
