package Collections;

import java.util.HashSet;
class EmployeeList implements Comparable<EmployeeList>
{  
	int id;  
	String name;  
	int sal;  
	EmployeeList(int id,String name,int sal)
	{  
	this.id=id;  
	this.name=name;  
	this.sal=sal;  
	} 
	@Override
public int compareTo(EmployeeList e)
{  
	if(id==e.id)  
	return 0;  
	else if(id>e.id)  
	return 1;  
	else  
	return -1; 
}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class HashSetDemo 
{
	public static void main(String args[])
	{
HashSet<Integer> empid=new HashSet<Integer>();
empid.add(461202);
empid.add(461206);
empid.add(461208);
empid.add(461208);
System.out.println("Sorted Employee ids: "+empid);
System.out.println("--------------------");

HashSet<String> empname=new HashSet<String>();
empname.add("Alena");
empname.add("Asim");
empname.add("Kerene");
empname.add("Kall");
System.out.println("Sorted Employee names: "+empname);
System.out.println("--------------------");

HashSet<EmployeeList> emplist=new HashSet<EmployeeList>();
emplist.add(new EmployeeList(123, "Vaish", 89434));
emplist.add(new EmployeeList(123, "Vish", 89434));
emplist.add(new EmployeeList(323, "Vaish", 9434));
emplist.add(new EmployeeList(423, "Aish",7434));
System.out.println("Sorted Employee ids: "+emplist);
System.out.println("--------------------");

}	

}
