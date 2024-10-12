package CodeImplementation;

import java.util.Scanner;

public class Alphabet 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter an alphabet: ");
		char c=sc.next().charAt(0);
		if(( c>='a' && c<='z')||(c>='A' && c<='Z'))
		{
			System.out.println(c+ " is an alphabet");
		}
		else
		{
			System.out.println(c+ " is not an alphabet");
		}
	}

}
