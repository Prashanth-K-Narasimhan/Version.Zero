package userDefinedException;

import java.io.*;

public class LoanEligible 
{	
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	
	public int salary;
	public LoanEligible()
	{
		System.out.println("Default Constructor");
	}
	
	public int Display() throws Exception
	{		
			System.out.println("Enter your salary");
			salary = Integer.parseInt(br.readLine());
			return salary; 
	}
	
	public void validAge(int salary) throws exceptionnew
	{
		
	if(salary >= 10000)
		{
			throw new exceptionnew("eligible for a loan of 1 lakh");
		}
	else if(salary >= 50000)
		{
			throw new exceptionnew("eligible for a loan of 5 lakhs");
		}
	else if(salary >= 100000)
		{
			throw new exceptionnew("eligible for a loan of 10 lakhs");
		}

	if(salary<10000)
		{	
			throw new exceptionnew("not eligible for loan");
		}
	
	}
	
	public static void main(String[] args) throws Exception
	{	
		LoanEligible obj = new LoanEligible();
		obj.Display();
		obj.validAge(obj.salary);
	}

}
