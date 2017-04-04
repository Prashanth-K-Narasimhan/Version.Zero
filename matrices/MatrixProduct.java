package matrices;

public class MatrixProduct extends MatrixDisplay
{	
	public int[][] matrixProduct = new int[3][3];
	public void addMat()
	{
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{	
				for(int k = 0 ; k <= 2 ; k++)
				{
					matrixProduct[i][j] = matrixProduct[i][j] + (matrix1[i][k] * matrix2[k][j]);		
				}	
			}
	
		}
	}
	public void addDisplay()
	{	System.out.println("the product of the matrices:");	
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
				System.out.println(matrixProduct[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args)
	{
		MatrixProduct obj = new MatrixProduct();
		obj.accept();
		//obj.display();
		obj.addMat();
		obj.addDisplay();
	}
}