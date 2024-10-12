package CodeImplementation;

import java.util.Scanner;

public class AverageCalc 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub 
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");
		n=sc.nextInt();
		
		int[] array = new int[5];  
		System.out.println("Enter the elements of the array: "); 		
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		 
        double total = 0;
        for(int i=0; i<array.length; i++)
        {
        	total = total + array[i];
        }
        
        double average = total/array.length;
        System.out.format("The average of the given numbers is: %.2f", average);
	}

}
