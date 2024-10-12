package Collections;
//Treeset stores the ele in ascending order
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{  
int id;  
String empname,manager;  
int grade;  

public Employee(int id, String empname, String manager, int grade) 
{  
    this.id = id;  
    this.empname = empname;  
    this.manager = manager;       
    this.grade = grade;  
}  
public int compareTo(Employee e) 
{  
    if(id>e.id)
    {  
        return 1;  
    }
    else if(id<e.id)
    {  
        return -1;  
    }
    else
    {  
    return 0;  
    }  
}  
} 
public class TreeSetEmp 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<Employee> set=new TreeSet<Employee>();  
	    
		Employee e1=new Employee(461121,"John","Peter",3);  
		Employee e2=new Employee(461233,"Daniel","Guru",2);  
		Employee e3=new Employee(461101,"Joe","Houssan",1);  
	    
	    set.add(e1);  
	    set.add(e2);  
	    set.add(e3);  
	    
	    for(Employee e:set)
	    {  
	    System.out.println("The Employee ID of "+e.empname+" is: "+e.id+"| Manager: "+e.manager+"| Grade: "+e.grade);  
	    } 
	}

}
 
