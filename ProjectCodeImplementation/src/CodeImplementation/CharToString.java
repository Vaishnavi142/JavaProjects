package CodeImplementation;

import java.util.Arrays;

public class CharToString 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		char[] c = {'c', 'a', 'p', 'g', 'e', 'm', 'i', 'n', 'i'};

        String str = String.valueOf(c);
        String str1 = new String(c);

        System.out.println("String from character using meth 1: "+str);
        System.out.println("String from character using meth 2: "+str1);
        
        System.out.println("\nCharacters from String: ");
        String str2 = "Get the future you want";
        char[] chars = str2.toCharArray();
        System.out.println(Arrays.toString(chars));
	}

}
