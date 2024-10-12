package Collections;
//List maintains the order in which the elements are inserted
import java.util.ArrayList;

public class ArrayListEmp 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> empname=new ArrayList<String>();  
		empname.add("David");    
		empname.add("Joe");    
		empname.add("Ajay");   
		empname.add("John");  
		empname.add("Issac");
        System.out.println("List of Employees: "+empname);   
       
        empname.remove("Ajay");  
        System.out.println("After removing a name from list: "+empname);   
        
        empname.remove(0);  
        System.out.println("After removing a name based on index: "+empname);   
          
         
        ArrayList<String> empname2=new ArrayList<String>();    
        empname2.add("Daisy");    
        empname2.add("Paige");    
        empname.addAll(empname2);  
        System.out.println("Creating new List(Updated list): "+empname);   
         
        empname.removeAll(empname2);  
        System.out.println("After removing new elements from list: "+empname);   
               
        empname.clear();  
        System.out.println("After Deleting all the elements in the list: "+empname);   
     }  
  }
	
