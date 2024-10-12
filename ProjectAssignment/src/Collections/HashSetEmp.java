package Collections;
//LinkedHashSet maintains insertion order
import java.util.HashSet;

public class HashSetEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<String> empname=new HashSet<String>();  
		  empname.add("Ajay");  
		  empname.add("Sharan");  
		  empname.add("Gambheer");  
		  empname.add("Sumit");  
          System.out.println("List of employees(Create): "+empname);  
         
          empname.remove("Gambheer");  
          System.out.println("After removing an element(Remove): "+empname);  
          
          HashSet<String> empname1=new HashSet<String>();  
          empname1.add("jay");  
          empname1.add("Smit");  
          empname.addAll(empname1);  
          System.out.println("Updated List(Update): "+empname);  
         
          empname.removeAll(empname1);  
          System.out.println("After removing all elements from list: "+empname);  
              
          empname.clear();  
          System.out.println("After deleting the list(Delete): "+empname); 
	}

}
