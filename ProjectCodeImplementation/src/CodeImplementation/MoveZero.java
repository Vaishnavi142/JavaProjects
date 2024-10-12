package CodeImplementation;

public class MoveZero 
{
		// TODO Auto-generated method stub
		  static void pushZerosToEnd(int a[], int n)
		    {
		        int count = 0; 
		        for (int i = 0; i < n; i++)
		            if (a[i] != 0)
		                a[count++] = a[i];
		        while (count < n)
		            a[count++] = 0;
		    }		    
		    public static void main(String[] args)
		    {
		        int a[] = {1, 0, 7, 8, 6, 4, 0, 0};
		        int n = a.length;
		        pushZerosToEnd(a, n);
		        System.out.println("Array after pushing zeros to the end: ");
		        for (int i=0; i<n; i++)
		        {
		            System.out.print(a[i]+" ");
		        }
	}

}
