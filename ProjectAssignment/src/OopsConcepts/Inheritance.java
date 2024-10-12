package OopsConcepts;
class Emp 
{
	  public void status() 
	  {
	    System.out.println("working");
	  }
	}
	class Empdetails extends Emp 
	{
	  @Override
	  public void status() 
	  {
	    System.out.println("Employee status: Currently working");
	  }
	  public void position() 
	  {
	    System.out.println("Employee position: Project Manager");
	  }
	}

public class Inheritance 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Empdetails s = new Empdetails();
		s.status();
	    s.position();
	}

}
