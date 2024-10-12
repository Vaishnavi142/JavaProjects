package CodeImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistToArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> EmpDetails = new ArrayList<>();
		System.out.println("Required Employee details: ");
		EmpDetails.add("Employee name");
		EmpDetails.add("Employee id");
		EmpDetails.add("Base Location");
		EmpDetails.add("Reporting manager");
	    System.out.println("ArrayList: " + EmpDetails);

	    String[] arr = new String[EmpDetails.size()];
	    EmpDetails.toArray(arr);
	    System.out.print("Converted Array: ");
	    for(String item:arr) 
	    {
	      System.out.print(item+", ");
	    }
	    System.out.print("\n");
	    
	    ArrayList<String> EmpDetails1= new ArrayList<>(Arrays.asList(arr));
	    System.out.println("Converted List: " + EmpDetails1);
	}

}
