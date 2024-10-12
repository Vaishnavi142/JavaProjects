package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		      int[] num = {0,2,3,4};
		      System.out.println(num[8]);		    
		} 
		catch (Exception e) 
		{
		      System.out.println("Something went wrong.");
		} 
		finally 
		{
		      System.out.println("End of the program.");
		}
	}

}
