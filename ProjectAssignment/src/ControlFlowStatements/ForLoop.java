package ControlFlowStatements;

import java.util.Scanner;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		int sum;
		System.out.println("Enter the value"); 
		Scanner sc= new Scanner(System.in);
		sum=sc.nextInt();
		for(int j = 1; j<=10; j++) 
		{  
		sum = sum + j;  
		}  
		System.out.println("Sum of first " + sum+ " natural numbers: " + sum); 
	}

}
