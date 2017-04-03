package arrayexample3;

import java.util.Scanner;

public class ArrayExp2 
	{
	String[][] database = new String[2][10];
	int[] array = new int[10];
	public int temp = 0;
	public int highest = 0;
	public void acceptStdName()
	{
			Scanner input;
			System.out.println("Enter the names of the students");	
			for(int i = 0 ; i <= 9 ; i++)
			{
				input = new Scanner(System.in);
			    database[0][i]= input.next();
			}
	}
	public void acceptStdMark()
	{
			Scanner input;
			System.out.println("Enter the marks of the students in the same order as the names you entered");	
			for(int i = 0 ; i <= 9 ; i++)
			{
				input = new Scanner(System.in);
				database[1][i]= input.next();
				array[i] = Integer.parseInt(database[1][i]);
			}
	}
	public void higestMark()
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
	
	public void topStd()
	{
		System.out.println(database[0][temp]+" scored the highest ");
		System.out.println("His mark was "+database[1][temp]);
	}
	public static void main(String[] args) 
	{
		ArrayExp2 obj = new ArrayExp2();
		obj.acceptStdName();
		obj.acceptStdMark();
		obj.higestMark();
		obj.topStd();

	}

}
