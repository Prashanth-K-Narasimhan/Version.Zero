package matrices;

public class MatrixAdd extends MatrixDisplay
{	public int[][] matrixAdd = new int[3][3];
	public void addMat()
	{
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
				matrixAdd[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
	}
	
	public void addDisplay()
	{	System.out.println("the sum of the matrices:");	
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
				System.out.println(matrixAdd[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args)
	{
		MatrixAdd obj = new MatrixAdd();
		obj.accept();
		//obj.display();
		obj.addMat();
		obj.addDisplay();
	}

}
