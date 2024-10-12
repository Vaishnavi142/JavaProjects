package Collections;

import java.util.TreeSet;
class Emp implements Comparable<Emp>
{  
	int id;  
	String name;  
	float sal;  
	Emp(int id,String name,float sal)
	{  
	this.id=id;  
	this.name=name;  
	this.sal=sal;  
	} 
	@Override
public int compareTo(Emp e)
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
		
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
public class TreeSetDemo
{
	public static void main(String[] args)
	{
	//treeset is unique and sorted collection
	TreeSet<Integer> intSet=new TreeSet<Integer>();;
	intSet.add(100);
	intSet.add(30);
	intSet.add(60);
	intSet.add(100);
	System.out.println("Employee id's:"+intSet);
	System.out.println("--------------------");
	
	TreeSet<String> citySet=new TreeSet<String>();;
	citySet.add("Pune");
	citySet.add("Delhi");
	citySet.add("Nopida");
	citySet.add("Pune");
	System.out.println("Employees Locations: "+citySet);
	System.out.println("--------------------");
	
	
	TreeSet<Emp> empSet=new TreeSet<Emp>();
	empSet.add(new Emp(789,"Vaishali",5670.0F));
	empSet.add(new Emp(111,"Amit",40000.0F));
	empSet.add(new Emp(789,"Vaishali",5670.0F));
	empSet.add(new Emp(666,"Smita",1000.0F));
	System.out.println(empSet);
	System.out.println("--------------------");
	}
}



