package ControlFlowStatements;
//import java.lang.*;
import java.util.Scanner;
public class IfElse 
{
	public static void main(String[] args) 
	{
		int score;
        System.out.println("Enter the score: ");
        Scanner in = new Scanner(System.in);
        score = in.nextInt();
        if (score >= 95)
        {
            System.out.println("A Grade");
        }
        else if (score >= 85 && score <= 95)
        {
            System.out.println("B Grade");
        }
        else if (score >= 65 && score <= 85)
        {
            System.out.println("C Grade");
        }
        else if (score >= 55 && score <= 65)
        {
            System.out.println("D Grade");
        }
        else 
        {
            System.out.println("Failed. Retake the exam");
        }
	}

}
