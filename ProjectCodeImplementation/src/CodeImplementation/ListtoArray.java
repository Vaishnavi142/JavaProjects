package CodeImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListtoArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 	ArrayList<String> languages = new ArrayList<>();
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    System.out.println("Given ArrayList: " + languages);
		    String[] arr = new String[languages.size()];
		    languages.toArray(arr);
		    System.out.print("Array: ");
		    for(String item:arr) 
		    {
		      System.out.print(item+", ");
		    }
		    System.out.print("\n");
		    String[] array = {"Java", "Python", "C"};
		    System.out.println("Given Array: " + Arrays.toString(array));
		    List skills= new ArrayList<>(Arrays.asList(array));
		    System.out.println("List: " + skills);
}
}