package CodeImplementation;

public class SwapNum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int num1 = 56; 
        int num2 = 12;
        System.out.println("Before swap:");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        num1 = num1 - num2; //int temp=num1;
        num2 = num1 + num2; //num1=num2;
        num1 = num2 - num1; //num2=temp;

        System.out.println("After swap:");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
	}

}
