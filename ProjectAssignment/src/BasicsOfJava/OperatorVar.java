package BasicsOfJava;
import java.lang.String;
public class OperatorVar 
{
	public static void main(String[] args) 
	{
		 
		int inp1 = 7, inp2 = 5;
		System.out.println("Arithmetic operator: ");
	    System.out.println("Addition of 2 values = " + (inp1 + inp2));
	    System.out.println("Subtraction of 2 values = " + (inp1 - inp2));
	    System.out.println("Multiplication of 2 values = " + (inp1 * inp2));
	    System.out.println("Division of 2 values = " + (inp1 / inp2));
	    System.out.println("Modulos from 2 values = " + (inp1 % inp2));
	    System.out.println("\n");	    
	    
	    int val = 4;
	    int var;
	    var = val;
	    System.out.println("Assignment operator: ");
	    System.out.println("Value assigned to variable var: " + var);
	    var += val;
	    System.out.println("+= assignment operator value: " + var);
	    var *= val;
	    System.out.println("*= assignment operator value: " + var);
	    System.out.println("\n");
	    
	    int n1 = 7, n2 = 11;
	    System.out.println("Relational operator: ");
	    System.out.println("First number is " + n1 + " Second number is " + n2);
	    System.out.println("First num is equal to sec num: " + (n1 == n2));
	    System.out.println("First num is equal to sec num: " + (n1 != n2));
	    System.out.println("First num is equal to sec num: " + (n1 > n2));
	    System.out.println("First num is equal to sec num: " + (n1 < n2));
	    System.out.println("First num is equal to sec num: " + (n1 >= n2));
	    System.out.println("First num is equal to sec num: " + (n1 <= n2));
	    System.out.println("\n");
	    
	    System.out.println("Logical operator: ");
	    System.out.println("AND operator: "+ ((5 > 3) && (8 > 5)));
	    System.out.println("AND operator: "+ ((5 > 3) && (8 < 5)));
	    System.out.println("OR operator: "+ ((5 < 3) || (8 > 5))); 
	    System.out.println("OR operator: "+ ((5 > 3) || (8 < 5))); 
	    System.out.println("NOT operator: "+ (!(5 == 3)));  
	    System.out.println("NOT operator: "+ (!(5 > 3)));  
	    System.out.println("\n");
	    
	    int num1 = 12, num2 = 12;
	    int result1, result2;
	    System.out.println("Increment operator: ");
	    System.out.println("Value of num1: " + num1);
	    result1 = ++num1;
	    System.out.println("After increment: " + result1);
	    System.out.println("\n");
	    
	    System.out.println("Decrement operator: ");
	    System.out.println("Value of num2: " + num2);
	    result2 = --num2;
	    System.out.println("After decrement: " + result2);
	    System.out.println("\n");
	    
	    System.out.println("Ternary operator: ");
	    int age=16;
	    String result;
	    result = (age >= 20 ) ? "Eligible" : " Not Eligible";
	    System.out.println(result);
	   
	    
	    
	}

}
