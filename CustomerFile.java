package bigDataType;

import java.io.*;
import java.util.Scanner;

public class CustomerFile 
{
	private static Scanner input;

	public static void main(String[] args)
	{
	
	Data[] Employee = getData();
	File file = new File("G:\\EmployeeData.txt");
	File file1 = new File("G:\\EmployeeDataTAX.txt");
	PrintWriter out = null;
	BufferedReader in = null;
	PrintWriter out1 = null;
	
		try
		{
			out1 = new PrintWriter( new BufferedWriter( new FileWriter(file1) ), true );
		}
		catch (IOException e1)
		{
			System.out.println(" IOException occurs...");
		}
	
	
	int Choice = display();	
	if(Choice == 1)
	{
		
		try 
		{
			out = new PrintWriter( new BufferedWriter( new FileWriter(file) ), true );
		} 
		catch (IOException e) 
		{
			System.out.println(" IOException occurs...");
		}
		for (Data m : Employee)
			writeData(m, out);
		out.close();
	}
	 
	 else if(Choice == 2)
	 {
		 try {
			in = new BufferedReader(new FileReader(file) );
		}
		 catch (FileNotFoundException e)
		 {
		System.out.println("File not found...");
		}
		 Data D = readData(in);
		 while (D != null)
		 {
			 
		 String msg = D.ID+": ";
		 msg += ": " + D.Name;
		 msg += ": " +Integer.toString(D.Age);
		 msg += ": " + D.Phone;
		 msg += " (" + Double.toString(D.Salary) + ")";
		 msg += ": " + D.City;
		 msg += ": " + D.Country;
		 System.out.println(msg);
		 D = readData(in);
		 
		 for (Data m : Employee)
				writeDataTax(m, out1);
			out1.close();
		 
		 }
	 }
	}
	private static Data[] getData()
	{
	Data[] Employee = new Data[10];
	Employee[0] = new Data("98453", "Rahul", 34, "9847503233", 59095, "Chennai", "India");
	Employee[1] = new Data("34235", "Lexus", 54, "5677503445", 129095, "New York", "USA");
	Employee[2] = new Data("45634", "Mark", 65, "9677503456", 79095, "Berlin", "Germany");
	Employee[3] = new Data("57676", "Vincent", 24, "8984750327", 99095, "Paris", "France");
	Employee[4] = new Data("95345", "Kim Bam", 53, "7674750325", 49095, "Seoul", "South Korea");
	Employee[5] = new Data("56565", "John", 23, "1287503233", 89095, "London", "UK");
	Employee[6] = new Data("34355", "Agarwal", 56, "9847578003", 109095, "Bangalore", "India");
	Employee[7] = new Data("98453", "Marcus", 33, "7884750783", 39095, "Brazilia", "Brazil");
	Employee[8] = new Data("97675", "Sameera", 19, "4775036783", 69095, "Delhi", "India");
	Employee[9] = new Data("87656", "Samir", 32, "8867503232", 79095, "Kabul", "Pakistan");
	return Employee;
	}
	
	private static void writeData(Data m,	PrintWriter out)
	{
	String line = m.ID;
	line += "\t" + m.Name;
	line += "\t" + Integer.toString(m.Age);
	line += "\t" + m.Phone;
	line += "\t" + Double.toString(m.Salary);
	line += "\t" + m.City;
	line += "\t" + m.Country;
	out.println(line);
	
	}
	
	private static void writeDataTax(Data m, PrintWriter out1)
	{
		if(m.Salary >= 100000)
		{
			String line = m.ID;
			line += "\t" + m.Name;
			line += "\t" + Integer.toString(m.Age);
			line += "\t" + m.Phone;
			line += "\t" + Double.toString(m.Salary);
			line += "\t" + m.City;
			line += "\t" + m.Country;
			out1.println(line);
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
	
	private static Data readData(BufferedReader in)
	{
		String ID;
		String Name;
		int Age;
		String Phone;
		double Salary;
		String City;
		String Country;
		String line = "";
		String[] data;
		try
		{
			line = in.readLine();
		}
		catch (IOException e)
		{
			System.out.println(" IOException occurs...");			
		}
		if (line == null)
			return null;
		else
		{
			data = line.split("\t");
			ID = data[0];
			Name = data[1];
			Age = Integer.parseInt(data[2]);
			Phone = data[3];
			Salary = Double.parseDouble(data[4]);
			City = data[5];
			Country = data[6];
			
			return new Data(ID, Name, Age, Phone, Salary, City, Country);
		}
	}
}
	
class Data
	{
		public String ID;
		public String Name;
		public int Age;
		public String Phone;
		public double Salary;
		public String City;
		public String Country;
	
		public Data(String ID, String Name, int Age, String Phone, double Salary, String City, String Country)
		{
			this.ID = ID;
			this.Name = Name;
			this.Age = Age;
			this.Phone = Phone;
			this.Salary = Salary;
			this.City = City;
			this.Country = Country;
		}
	}
