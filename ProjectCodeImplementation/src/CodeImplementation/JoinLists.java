package CodeImplementation;

import java.util.ArrayList;
import java.util.List;

public class JoinLists 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> L1 = new ArrayList<String>();
        L1.add("Employee name");

        List<String> L2 = new ArrayList<String>();
        L2.add("Employee id");

        List<String> result = new ArrayList<String>();
        result.addAll(L1);
        result.addAll(L2);

        System.out.println("list1: " + L1);
        System.out.println("list2: " + L2);
        System.out.println("Joined List is: " + result);
	}

}
