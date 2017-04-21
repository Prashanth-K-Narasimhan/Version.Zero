package classWrk;

import java.io.*;
import java.util.Scanner;

public class StudentDataBase
{
	private static Scanner input;

	public static void main(String[] args)
	{
		int Choice = display();
		File file = new File("G:\\StudentDbms.dat");
	 if(Choice == 1)
	 {
		System.out.println("Writer is processing..");
		DBMS[] Student = getData();
		
		DataOutputStream out = null;
		try 
		{
			out = new DataOutputStream( new BufferedOutputStream( new FileOutputStream(file) ) );
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("The File was not found..");
		}
		for (DBMS m : Student)
			{
				writeData(m, out);
			}
		
		try 
		{
			out.close();
		}
		
		catch (IOException e) 
		{
			System.out.println("Error Closing File...");
		}
		System.out.println("Done!");
	 }
	 
	 else if(Choice == 2)
	 {
		DataInputStream in = null;
		try 
		{
			in = new DataInputStream( new BufferedInputStream( new FileInputStream(file) ) );
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("The File was not found..");
		}
		
		File file1 = new File("G:\\StudentDbmsRef.dat");
		DataOutputStream out1 = null;
		try 
		{
			out1 = new DataOutputStream( new BufferedOutputStream( new FileOutputStream(file1) ) );
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("The File was not found..");
		}
		
		boolean endofLine = false;
		
		while (!endofLine)
		{
			DBMS d = readData(in);
			if (d == null)
				endofLine = true;
			else
			{
				try
				{
					if(d.Age>=18)
					{
						String msg = d.Name;
						out1.writeUTF(d.Name);
						msg += ": " + d.Age;
						out1.writeInt(d.Age);
						msg += " (" + d.Fee + ")";
						out1.writeFloat(d.Fee);
						msg += " Gender: " + d.Gender;
						out1.writeChar(d.Gender);
						System.out.println(msg);
					}
					else
					{
						String temp;
						String msg = temp = d.Name;
						msg += ": " + d.Age;
						msg += " (" + d.Fee + ")";
						msg += " Gender: " + d.Gender;
						System.out.println(temp+ " was not 18 years of age..");
					}
				}
				catch(IOException e)
				{
					System.out.println(" Exception thrown... ");
				}
			}
		}
	 }
	}
private static int display() 
{
	System.out.println("What would you like to do?");
	System.out.println("1. Write to a file");
	System.out.println("2. Read the File");
		input = new Scanner(System.in);
	    String temp = input.next();
	    if(temp.equals("1"))
	    {
	    	return 1;
	    }
	    else if(temp.equals("2"))
	    {
	    	return 2;
	    }
		return 0;
}
private static DBMS[] getData()
{
	DBMS[] Student = new DBMS[10];
	
	Student[0] = new DBMS("Arya", 21, 16000, 'M' );
	Student[1] = new DBMS("Barath", 19, 23000, 'M' );
	Student[2] = new DBMS("Chris", 18, 45000, 'M' );
	Student[3] = new DBMS("Janice", 15, 26000, 'F' );
	Student[4] = new DBMS("Hawk", 14, 15000, 'M' );
	Student[5] = new DBMS("Skye", 20, 17000, 'F' );
	Student[6] = new DBMS("Lex", 17, 21000, 'M' );
	Student[7] = new DBMS("Josh", 15, 46000, 'M' );
	Student[8] = new DBMS("Robbie", 17, 66000, 'F' );
	Student[9] = new DBMS("Ursa", 19, 75000, 'F' );
	
	return Student;
}

private static DBMS readData (DataInputStream in)
{
	String Name = " ";
	int Age = 0;
	float Fee = 0.0f;
	char Gender = ' ';
	try
	{
		Name = in.readUTF();
		Age = in.readInt();
		Fee = in.readFloat();
		Gender = in.readChar();
	}
	catch (IOException e)
	{
		return null;
	}
	return new DBMS(Name, Age, Fee, Gender);
	
}
private static void writeData(DBMS m, DataOutputStream out)
{
	try
	{
		out.writeUTF(m.Name);
		out.writeInt(m.Age);
		out.writeFloat(m.Fee);
		out.writeChar(m.Gender);
	}
	catch (IOException e)
	{
		System.out.println("Error writing the Data..");
	}
}

public static class DBMS
{
	public String Name;
	public int Age;
	public float Fee;
	public char Gender;
	
	public DBMS(String Name, int Age, float Fee, char Gender)
	{
		this.Name = Name;
		this.Age = Age;
		this.Fee = Fee;
		this.Gender = Gender;
	}
}
}