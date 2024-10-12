package AccessModifiers;

class PrivateAccSpecifier 
{
	private void speak() 
	{
	    System.out.println("Private Access Specifier");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrivateAccSpecifier ob = new PrivateAccSpecifier();
	    ob.speak();
	}

}
