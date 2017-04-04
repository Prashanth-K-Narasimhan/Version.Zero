package matrices;

import java.util.Scanner;

public class MatrixDisplay
{
	public int[][] matrix1 = new int[3][3];
	public int[][] matrix2 = new int[3][3];
		
	public void accept()
	{
		Scanner input;
		System.out.println("Enter the elements for the first matrix:");	
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
			input = new Scanner(System.in);
		    matrix1[i][j]= input.nextInt();
			}
		}	
		
		System.out.println("Enter the elements for the second matrix:");	
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
			input = new Scanner(System.in);
		    matrix2[i][j]= input.nextInt();
			}
		}
	}
	
	public void display()
	{
		System.out.println("the first matrix:");	
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
				System.out.println(matrix1[i][j]+" ");
			}
			System.out.println();
		}	
		
		System.out.println("the second matrix:");	
		for(int i = 0 ; i <= 2 ; i++)
		{
			for(int j = 0 ; j <= 2 ; j++ )
			{
				System.out.println(matrix2[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) 
	{
		MatrixDisplay obj = new MatrixDisplay();
		obj.accept();
		obj.display();
	}

}
