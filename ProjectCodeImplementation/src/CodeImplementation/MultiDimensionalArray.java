package CodeImplementation;

public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int rows = 2, columns = 4;
        int[][] matA = { {1, 2, 1, 2}, {2, 3, 4, 3} };
        int[][] matB = { {4, 3, 1, 5}, {-1, 2, 4, 3} };
        
       
        int[][] sum = new int[rows][columns];
        for(int i=0; i<rows; i++) 
        {
            for (int j=0; j<columns; j++) 
            {
                sum[i][j] = matA[i][j] + matB[i][j];
            }
        }
        
        System.out.println("Sum of the given matrices is: ");
        for(int i=0; i<rows; i++) 
        {
            for (int j=0; j<columns; j++) 
            {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
	     }

	}
}
