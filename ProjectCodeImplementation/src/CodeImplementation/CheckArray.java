package CodeImplementation;

import java.util.Scanner;

public class CheckArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {20, 34, 12, 17, 45,78};
		int num;
		boolean array=false;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number to check whether it is present in the array or not: ");
		num=sc.nextInt();
		
		for(int i = 0; i<arr.length; i++)
		{
			if(num == arr[i])
			{
				array=true;
				break;
			}
		}
		
		if(array)	
		   {
		      System.out.println("Array contains the given element");
		   }
		   else
		   {
			   System.out.println("Array does not contain the given element");
		   }		
	}
}
