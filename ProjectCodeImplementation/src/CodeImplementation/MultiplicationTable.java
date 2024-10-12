package CodeImplementation;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the table number: ");
		int num=sc.nextInt();
		System.out.print("Enter the number if times: ");
		int times =sc.nextInt();
        for(int i = 1; i <= times; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
	}

}
