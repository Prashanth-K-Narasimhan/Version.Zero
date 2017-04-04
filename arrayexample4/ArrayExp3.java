package arrayexample4;

import java.util.Scanner;

public class ArrayExp3 
	{
	String[][] database = new String[2][10];
	int[] array = new int[10];
	public int temp = 0;
	public int temp1 = 0;
	public int highest = 0;
	public int lowest = 0;
	public void acceptStdName()
	{
			Scanner input;
			System.out.println("Enter the names of the employees");	
			for(int i = 0 ; i <= 9 ; i++)
			{
				input = new Scanner(System.in);
			    database[0][i]= input.next();
			}
	}
	public void acceptStdSal()
	{
			Scanner input;
			System.out.println("Enter the salaries of the employees in the same order as the names you entered");	
			for(int i = 0 ; i <= 9 ; i++)
			{
				input = new Scanner(System.in);
				database[1][i]= input.next();
				array[i] = Integer.parseInt(database[1][i]);
			}
	}
	public void highestSal()
	{	
		for(int i = 0; i <= 9 ; i++)
		{
				if(array[i] > highest)
				{  
					 temp = i;
					 highest = array [i];
				}
				
		}
	}
	
	public void lowestSal()
	{	
		for(int i = 0; i <= 9 ; i++)
		{
				if(array[i] < highest)
				{  
					 temp1 = i;
					 lowest = array [i];
				}
				
		}
	}
	public void topStd()
	{
		System.out.println(database[0][temp]+" gets the highest salary");
		System.out.println("His salary was "+database[1][temp]);
		System.out.println(" ");
		System.out.println(database[0][temp1]+" gets the lowest salary");
		System.out.println("His salary was "+database[1][temp1]);
		
	}
	public static void main(String[] args) 
	{
		ArrayExp3 obj = new ArrayExp3();
		obj.acceptStdName();
		obj.acceptStdSal();
		obj.highestSal();
		obj.topStd();
	}

}
