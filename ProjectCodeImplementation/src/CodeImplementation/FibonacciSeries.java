package CodeImplementation;

import java.util.Scanner;

public class FibonacciSeries 
{
	 static void Fibonacci(int n)
	    {
	        int num1 = 0, num2 = 1;	  
	        int counter = 0;
	        while (counter < n) 
	        {
	            System.out.print(num1 + " ");
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            counter = counter + 1;
	        }
	    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The fibonacci series till the entered num is: ");
        Fibonacci(n);
        
	}

}
