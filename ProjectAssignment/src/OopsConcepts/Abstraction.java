package OopsConcepts;

import java.util.Scanner;

abstract class Employee
    {
	 abstract void brake();
	 }

	class Empname extends Employee 
	{
	  public void brake() 
	  {
	    System.out.println("Emp name: XYZ");
	  }
	}

	class EmpLoc extends Employee 
	{
	  public void brake() 
	  {
	    System.out.println("Employee Location: CCU");
	  }
	}
public class Abstraction 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your emp_id");
		int id=sc.nextInt();
		EmpLoc m1 = new EmpLoc();
	    m1.brake();
	    Empname s1 = new Empname();
	    s1.brake();
	}

}
