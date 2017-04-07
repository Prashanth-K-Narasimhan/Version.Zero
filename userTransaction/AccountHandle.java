package userTransaction;

import java.util.Scanner;

public class AccountHandle 
{	public Scanner scanner;
	public int i=0;
	public int amount;

	public int Display()
	{
		System.out.println("What would you like to do?");
		System.out.println("1. --> Withdraw");
		System.out.println("2. --> Deposit");
		System.out.println("Please press 1 or 2");
		scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		return selection;
	}
	public void Withdraw() throws Exception
	{
		System.out.println("Please enter your four Digit pin number:");
		try
		{
			int PIN = scanner.nextInt();
			checkPin(PIN);
		}
		catch(Exception e)
		{
			System.out.println("Please check the PIN number you have typed.");
		}
		System.out.println("Please enter the amount you wish to withdraw");
		
			amount = scanner.nextInt();
			if(amount<=46000)
			{
				System.out.println("Please collect your cash");
			}
			else
			{	
				throw new userAmtException("Invalid entry");
			}
			
	}
	
	public void Deposit() throws Exception
	{
		System.out.println("Please enter your four Digit pin number:");
		try
		{
			int PIN = scanner.nextInt();
			checkPin(PIN);
		}
		catch(Exception e)
		{
			System.out.println("Please check the PIN number you have typed.");
		}
		System.out.println("Please enter the amount you wish to deposit");
		amount = scanner.nextInt();
		if(amount>200000)
		{
			System.out.println("Please enter your pan card details");
			String PAN = scanner.next();
		//	throw new userAmtException("Transaction will be processed, only if the PAN number is valid");
			boolean PANresult = checkDatabase(PAN);
			if(PANresult)
			{
				System.out.println("Please place your cash for deposit");
			}
			else
			{	throw new userAmtException("Invalid entry");	}
		}
		else{ System.out.println("Please place your cash for deposit");}
	}
	public boolean checkDatabase(String data) throws userAmtException
	{
		if(data.equals("AYNDS3456S"))
		{
			return true;
		}
		else
		{	
			return false;
		}
	}
	public void checkPin(int code) throws Exception
	{
	try
	{	
		while(code!=1234)
		{	
			System.out.println("Please check the PIN number you have typed.");
			code = scanner.nextInt();
			
			i++;
			if(i==3)
			{	
				System.out.println("Your Account has been blocked temporarily.");
				System.exit(0);
			}
		}
		if(code==1234)
		{
			return;
		}
	}
		catch(Exception e)
		{	
			System.out.println("Please check the PIN number you have typed.");
		}
	}
	
	public static void main(String[] args) throws Exception 
	{
		AccountHandle object = new AccountHandle();
		int choice = object.Display();
		if(choice == 1)
			{
			object.Withdraw();
			}
		if(choice == 2)
			{
			object.Deposit();
			}
	}

}
