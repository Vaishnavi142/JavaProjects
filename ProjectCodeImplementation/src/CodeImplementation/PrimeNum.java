package CodeImplementation;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  num,count=0;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
			if(count==0)
				System.out.println("\nIt is a Prime Number.");
			else
				System.out.println("\nIt is not a Prime Number.");
	}
}
