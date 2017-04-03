package arraysexample2;

import java.util.Scanner;

public class ArrayExp1 {
		int[] numbers;
		int total=0;
		int average=0;
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
				total = total + numbers[i];	
			}
			average = total/numbers.length;
		}
		
		public void print()
		{
			System.out.println("The total of the set of integers is  "+total);
			System.out.println("The average of the set of integers is  "+average);
		}

public static void main(String[] args) 
	{
		ArrayExp1 obj = new ArrayExp1();
		obj.accept();
		obj.execute();
		obj.print();
	}
}
