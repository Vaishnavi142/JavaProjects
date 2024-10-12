package CollectionAssignment;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private float empSal;	
	private char empGender;
	private  Date empDOJ;
	private static int empCount;
	static
	{
		empCount=0;
		System.out.println(" Static block for Employee executed");
	}

	{
		System.out.println("non staticblock emp ");
	}
	public Employee(int empId, String empName, float empSal, 
			char empGender, Date empDOJ) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empGender = empGender;
		this.empDOJ = empDOJ;
		empCount++;
	}
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public Date getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(Date empDOJ) {
		this.empDOJ = empDOJ;
	}
	public float calcAnnualSal()
	{
		return (this.empSal*12);
	}
	public String dispEmpInfo()
	{		
		return "ID:"+this.empId+ " Name:"+this.empName+
				"  BasicSalary:"+this.empSal+
				" Gender:"+this.empGender+ 
				" DOJ: "+empDOJ.dispDate() + 
				"  AnnualSal : "+this.calcAnnualSal();
	}
	public String toString()
	{		
		return "ID:"+this.empId+ " Name:"+this.empName+
				"  BasicSalary:"+this.empSal+
				" Gender:"+this.empGender+ 
				" DOJ: "+empDOJ.dispDate() + 
				"  AnnualSal : "+this.calcAnnualSal();
	}

	public static int getCount()
	{
		return empCount;
	}

	public boolean equals(Object emp) 
	{
		Employee ee=(Employee)emp;
		if(this.empId==ee.empId)
		{
			return true;
		}
		else
			return false;
	}
	@Override
	public int hashCode() {

		return this.empId;
	}
	
	@Override
	public int compareTo(Employee emp)
	{
		if(this.empId<emp.empId)
		{
			return -1;
		}
		else if(this.empId==emp.empId)
		{
			return  0;
		}
		else
		{
			return +1;
		}
	}

}

public class TreeSetEmployee {
	public static void main(String[] args)
	{
		// treeset is unique and sorted collection
		TreeSet<Integer> intSet=new TreeSet<Integer>();
		 intSet.add(30);
		 intSet.add(80);
		 intSet.add(100);
		 intSet.add(30);
		 intSet.add(1);
		 intSet.add(78);
		 System.out.println(intSet);
		 Iterator<Integer> intIt= intSet.iterator();
		 while(intIt.hasNext())
		 {
			 	System.out.print(intIt.next() + "- ");			 
		 }	
		 //------------------EmpSet---------------------
		 TreeSet<Employee> empSet=new TreeSet<Employee>();
		 empSet.add(new Employee(789,"vaishali",3000.0F,'F',new Date()));
		 empSet.add(new Employee(111,"Richa",1000.0F,'F',new Date()));
		 empSet.add(new Employee(333,"Rishab",45000.0F,'M',new Date()));
		 empSet.add(new Employee(222,"Devasri",33000.0F,'F',new Date()));
		 empSet.add(new Employee(666,"Pradip",67000.0F,'M',new Date()));
		 empSet.add(new Employee(789,"vaishali",3000.0F,'F',new Date()));
		 System.out.println("-----------------------");
		// System.out.println(empSet);
		 Iterator<Employee> empIt= empSet.iterator();
		 while(empIt.hasNext())
		 {
			 	System.out.println(empIt.next() + "- ");			 
		 }	
	}

}
