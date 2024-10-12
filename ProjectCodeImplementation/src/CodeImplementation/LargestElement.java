package CodeImplementation;

import java.util.Scanner;

public class LargestElement 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    int temp, size,n;		  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");
			n=sc.nextInt();
	      
	        int[] array = new int[5];  
			System.out.println("Enter the elements of the array: "); 		
			for(int i=0; i<n; i++)  
			{  
			array[i]=sc.nextInt();  
			} 
	        size = array.length;

	      for(int i = 0; i<size; i++ )
	      {
	         for(int j = i+1; j<size; j++)
	         {
	            if(array[i]>array[j])
	            {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Largest element in the given array is: "+array[size-1]);
	}

}
