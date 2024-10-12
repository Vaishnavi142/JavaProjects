package Collections;
//stores element as key value pair- Treemap
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmp
{
	static TreeMap<Integer, String> emp;
    static void create()
    {       
        emp = new TreeMap<Integer, String>();  
        System.out.println("TreeMap created");
    }
  
    static void insert()
    {
        
    	emp.put(46110, "John");
    	emp.put(46115, "Joe");
    	emp.put(46120, "Harry");
    	emp.put(46125, "Jay");
    	emp.put(46130, "Cath");
  
        System.out.println("\nElements successfully inserted");
    }

    static void search(String value)
    {  
        System.out.println("\nEmployee \""+ value + "\" present? "+ emp.containsValue(value));
    }

    static void display()
    {     
        System.out.println("\nDisplaying the TreeMap:");  
        System.out.println("TreeMap: " +emp);
    }

    static void traverse()
    {
        System.out.println("\nList of Employees with empid:");
        for (Map.Entry<Integer, String> e : emp.entrySet())
        {
            System.out.println(e.getKey()+ " "+ e.getValue());
        }
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        create();
  
        insert();
  
        search("Cath");
  
        display();

        traverse();
	}

}



  
  
  
        