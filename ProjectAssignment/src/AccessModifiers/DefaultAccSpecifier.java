package AccessModifiers;

public class DefaultAccSpecifier 
{
	void test() 
	{
	    System.out.println("Default Access Specifier");
	}	
	public static void main(String[] args)  //if declared in outer package throws error. 
	{
		// TODO Auto-generated method stub
		DefaultAccSpecifier ob = new DefaultAccSpecifier();
	    ob.test();
	}

}
