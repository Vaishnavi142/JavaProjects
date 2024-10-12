package Strings;

import java.util.Scanner;

public class StringExample 
{

	public static void StrConcat(String str1) 
    { 
        str1 = str1 + "CG"; 
    } 
   
    public static void StrBufConcat(StringBuffer str2) 
    { 
        str2.append("CG"); 
    } 
   
    public static void StrBuildConcat(StringBuilder str3) 
    { 
        str3.append("CG"); 
    } 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("String concatenation sample: ");
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();		
        StrConcat(str1);
        System.out.println("Concatenated String result: "+str1);
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String: ");
		String s2=s.nextLine();
        StringBuffer str2 = new StringBuffer(s2); 
        StrBufConcat(str2); 
        System.out.println("Concatenated String result using StringBuffer: "+str2);
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a String: ");
		String s3=scn.nextLine();
        StringBuilder str3 = new StringBuilder(s3); 
        StrBuildConcat(str3);
        System.out.println("Concatenated String result using StringBuilder: " + str3); 
        System.out.println("\nFinal String result: " +str1+str2+str3); 
	}

}
