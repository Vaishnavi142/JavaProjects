package ControlFlowStatements;

import java.util.Scanner;

public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		int level;	
	    System.out.println("Choose your status:\n 1.Beginner\n 2.Intermediate\n 3.Expert");
	    Scanner sc=new Scanner(System.in);
	    String levelString = sc.nextLine();	 
	    
	    switch(levelString)
	    {  
	    case "Beginner": level=1;  
	    break;    
	    case "Intermediate": level=2;  
	    break;    
	    case "Expert": level=3;  
	    break;    
	    default: level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level); 
	}

}
