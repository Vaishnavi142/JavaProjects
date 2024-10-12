package ControlFlowStatements;

import java.util.Scanner;

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter i value: ");
		Scanner sc= new Scanner(System.in);
		i=sc.nextInt();
	    while (i < 5) 
	    {
	    System.out.println("The value of i is = " + i);
	    i++;
	    }
	    System.out.println("End of loop");
	}

}
