package arraysexample1;

import java.util.Scanner;

public class ArrayExp {
	int[] numbers;
	private int min;
	public void accept()
	{
			numbers = new int[10];
			Scanner input;
			System.out.println("Enter the set of Integers");
					
			for(int i = 0 ; i <= 9 ; i++)
			{
				input = new Scanner(System.in);
			    numbers[i]= input.nextInt();
			}
	}
	
	public void execute()
	{
		for(int i = 0; i<10 ; i++)
		{
								
				for(int j = 0 ; j < 9 ; j++)
				{
					if (numbers [j] > numbers [j+1])
					{
						min = numbers [j];
						numbers [j] = numbers [j+1];
						numbers [j+1] = min;
					}
				}
		}
	}
	
	public void print()
	{
		for(int i = 0; i < 10 ; i++)
				{
					System.out.println(" "+numbers [i]);
				}
	}

	public static void main(String[] args)
	{
		ArrayExp object = new ArrayExp();
		object.accept();
		object.execute();
		object.print();
	}

}
