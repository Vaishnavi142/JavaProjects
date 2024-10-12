package CodeImplementation;

import java.util.Arrays;

public class RemoveDuplicate 
{
    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char str[] = "LifeAtCapgemini".toCharArray();
		System.out.println("Given characters are: ");
        int n= str.length;
        for(int i=0;i<n;i++)
        {
        System.out.print(str[i]);
        }
        System.out.print("\n");
        System.out.println("After removing the duplicates: "+removeDuplicate(str, n));
	}

}
