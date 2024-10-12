package CodeImplementation;

import java.util.Scanner;

public class FrequencyOfChar 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a sentence or word: ");
		String str=sc.nextLine();
		System.out.print("Enter the character to find frequency: ");
		char ch=sc.next().charAt(0);
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) 
        {
            if(ch == str.charAt(i)) 
            {
                ++frequency;
            }
        }
        System.out.println(ch + "-has repeated " + frequency+" times");
        }

}
