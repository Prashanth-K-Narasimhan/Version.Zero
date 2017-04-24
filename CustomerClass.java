package customerPackage;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class CustomerClass 
	{
		public static ArrayList<String> details;
		private static int j;
		//private static Scanner scanner;
		private static int i;
		private static int k;
		private static int l;


		public static void main(String[] args)
		{
		
		
		File file = new File("G:\\CustomerDataBase.txt");
	// 	File file1 = new File("G:\\CustomerAnalysis.txt");
		PrintWriter out = null;
 		BufferedReader in = null;
//		PrintWriter out1 = null;
		
		/*	try
			{
				out1 = new PrintWriter( new BufferedWriter( new FileWriter(file1) ), true );
			}
			catch (IOException e1)
			{
				System.out.println(" IOException occurs...");
			}*/
		
		
		int Choice = display();	
		System.out.println(Choice);
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
			
			int cnum;
			
			System.out.println("Please enter the number of Customer Details you want to enter");
			Scanner input = new Scanner(System.in);
			cnum = input.nextInt();	
			
				for(int i=0; i<cnum ; i++)
				{
					userInput(out);
				}
				
			
		//	input1.close();
			out.close();
		} 
	  	
		else if(Choice == 2 || Choice == 3)
		 {
	  		
	 		try 
	 		{
				in = new BufferedReader(new FileReader(file) );
			}
			 catch (FileNotFoundException e)
			{
			System.out.println("File not found...");
			}
	 		
			i = 0;
			j = 0;
			k = 0;
			l = 0;
			String Nation = "";
			String Female = "F";
			String Male = "M";
			String Hobby = "";
			DataType D = readData(in);
			 while (D != null)
			 {
				 
			 String msg = " ID: "+D.ID;
			 msg += "\n Name: " + D.Name;
			 msg += "\n Sex: " + D.Gender;
			 msg += "\n Age: " +Integer.toString(D.Age);
			 msg += "\n Add: " + D.Address;
			 msg += "\n City: " + D.City;
			 msg += "\n Country: " + D.Country;
			 msg += "\n PIN: " + D.PIN;
			 msg += "\n Phone: " + D.Phone;
			 msg += "\n Area Of Interests: " + D.AOI;
			 msg += "\n D.O.B: " +D.Date;
			 System.out.println(msg);
			 System.out.println("------------------------------");
			 
			 if(D.Gender.equals(Male))
				 i++;
			 else if(D.Gender.equals(Female))
				 j++;
			 Nation += D.Country+" ";
			 Hobby += D.AOI;
			 if(D.Age >= 18)
				 k++;
			 if(D.Phone.equals(""))
				 l++;
			 D = readData(in);
			 }
			 
			 try 
			 {
				in.close();
			 }
			 catch (IOException e)
			 {
				// TODO Auto-generated catch block
			 }
			 
		if(Choice == 3)
		{
			 System.out.println("Choose what you want to find from the database:");
			 System.out.println("1. Total number of Male/Female Customers");
			 System.out.println("2. Total number of Customers from each Country");
			 System.out.println("3. Total number of Customers who chose 'Travelling' as their Area of Interest.");
			 System.out.println("4.  Total number of Customers who chose 'Reading' as their Area of Interest.");
			 System.out.println("5.  Total number of Customers who are above 18 years of age.");
			 System.out.println("6.  Total number of Customers who refused to disclose their Phone number.");
			 int Select;
			 System.out.println("enter your Choice:");
		
			 Scanner scanner1 = new Scanner(System.in);
			Select = scanner1.nextInt();

			if(Select == 1)
			{
				System.out.println("Total number of Male Customers:" +i);
				System.out.println("Total number of Male Customers:" +j);
			}
			else if(Select == 2)
				nationality(in, Nation);
			else if(Select == 3)
			 	Hobbies(in, Hobby, "Travelling");
			else if(Select == 4)
			 	Hobbies(in, Hobby, "Reading");
			else if(Select == 5)
				System.out.println("Total number of Customers whose age is above 18:" +k);
			else if(Select == 6)
				System.out.println("Total number of Customers who refused to disclose their Phone number:" +l);
	 }
	}
		}
		
		private static void Hobbies(BufferedReader in, String hobby2, String word) 
		{
			List<String> list = Arrays.asList(hobby2.split("\""));
		
		//    Set<String> Aoi = new HashSet<String>(list);
		    System.out.println(word + ": " + Collections.frequency(list, word));

		}
		public static void nationality(BufferedReader in, String nation) 
		{

			List<String> list = Arrays.asList(nation.split(" "));

		    Set<String> citiZen = new HashSet<String>(list);
		    for (String word : citiZen) 
		    {
		        System.out.println(word + ": " + Collections.frequency(list, word));
		    }
			
		}
		private static void userInput(PrintWriter out) 
		{
			
			String details;
			String IDCheck;
			String CheckName;
			String DOBCheck;
			
			String[] areas = new String[25];
			System.out.println("Welcome, Dear Customer!!");
		
			
			
			System.out.println("Please Enter your Details as follows..");

			System.out.println("ID:");
			
			Scanner scanner = new Scanner(System.in);
			IDCheck = scanner.nextLine();
			while(IDCheck.length() != 4)
			{ 
				System.out.println("Please Check the ID, you have entered (must be of character length 4)");
				System.out.println("ID:");
				IDCheck = scanner.nextLine();
			}
			while(IDCheck.charAt(0) != 'C' || IDCheck.length() != 4 )
			{ 
				System.out.println("Please Check the ID, you have entered (Starts with a letter)");
				System.out.println("ID:");
				IDCheck = scanner.nextLine();
			}
			
			details =IDCheck;
			
			System.out.println("Name:");
			CheckName = scanner.nextLine();
			while(CheckName == null)
			{
				System.out.println("Please type in a name (Cant be left blank)");
				System.out.println("Name:");
				CheckName = scanner.nextLine();
			}
			details += "\t" +CheckName;
			
			System.out.println("Gender: Male or Female (We request you to type M for male and F for female)");
			details += "\t" +scanner.nextLine();
			
			System.out.println("Age:");
			details += "\t" +scanner.nextLine();
			
			System.out.println("Address:");
			details += "\t" +scanner.nextLine();
			
			System.out.println("City:");
			details += "\t" +scanner.nextLine();
			
			System.out.println("Country:");
			details += "\t" +scanner.nextLine();
			
			System.out.println("PIN:");
			details += "\t" +scanner.nextLine();
			
			System.out.println("Phone:");
			details += "\t" +scanner.nextLine();
			
			System.out.println("Areas of Interest (We request you to type in atleast two:)");
			System.out.println("Please input the number of interests your willing to type in...");
			int number = scanner.nextInt();
			while(number < 2)
			{
				System.out.println("We request you to type atleast 2 Areas of Interest (For survey purposes only..))");
				System.out.println("Please input the number of interests your willing to type in...");
				number = scanner.nextInt();
			}
			System.out.println("Now type in your AOIs accompanied by the return/enter key)");
			int i = 0;
			String aoi = "";
			while(i != number || i < number)
			{
				areas[i]= scanner.next();
				aoi += "\""+ areas[i]+"\""; // null statement added due to usage of +=
				i++;
			}
			
			details += "\t" +aoi;
			scanner.nextLine();
			
			System.out.println("Date of Birth: ((dd/MM/YYYY) format)");
			DOBCheck = scanner.nextLine();
			while(DOBCheck.length() != 10)
			{
				System.out.println("Please enter the format correctly (not more than 10 chars, including /s)");
				System.out.println("Date of Birth: ((dd/MM/YYYY) format)");
				DOBCheck = scanner.nextLine();
			}
			details += "\t" +DOBCheck;

			out.println(details);
			
		}
	

		private static int display() 
		{
			System.out.println("What would you like to do?");
			System.out.println("1. Write to a Database");
		 	System.out.println("2. Read From Database");
		 	System.out.println("3. Perform Analysis on Data");
		 	Scanner input = new Scanner(System.in);	
			    String temp = input.next();
			    
			    if(temp.equals("1"))
			    {
			    	return 1;
			    }
			     else if(temp.equals("2"))
			    {
			    	return 2;
			    }
			     else if(temp.equals("3"))
			    {
			    	return 3;
			    }
			    
				return 0;
		}
		
	 	private static DataType readData(BufferedReader in)
		{
			String ID;
			String Name;
			String Gender;
			int Age;
			String Address;
			String City;
			String Country;
			String PIN;
			String Phone;
			String AOI;
			Date date = new Date();
			
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
				Gender = data[2];
				Age = Integer.parseInt(data[3]);
				Address = data[4];
				City = data[5];
				Country = data[6];
				PIN = data[7];
				Phone = data[8];
				AOI = data[9];
				
				try 
				{
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					date = sdf.parse(data[10]);
				}
				catch (ParseException e) 
				{
					System.out.println("Conversion error");
				}
				
				return new DataType(ID, Name, Gender, Age, Address, City, Country, PIN, Phone, AOI, date);
			}	 
	
		}
	 }
		
	class DataType
		{
			public String ID;
			public String Name;
			public String Gender;
			public int Age;
			public String Address;
			public String City;
			public String Country;
			public String PIN;
			public String Phone;
			public String AOI;
			public Date Date;
		
			public DataType(String ID, String Name, String Gender, int Age, String Address, String City, String Country, String PIN, String Phone, String AOI, Date Date)
			{
				this.ID = ID;
				this.Name = Name;
				this.Gender = Gender;
				this.Age =  Age;
				this.Address = Address;
				this.City = City;
				this.Country = Country;
				this.PIN = PIN;
				this.Phone = Phone;
				this.AOI = AOI;
				this.Date = Date;
				
				
			}
		}
		


