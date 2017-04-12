package ArrayListClassWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass 
{

			private static String temp1;

			public static void main(String[] aa)
			{	
				ArrayList<Database> employeeDetails = new ArrayList<Database>();
				
				Database b1 = new Database(1,"Donald", 49, 70000);
				Database b2 = new Database(2,"Cersei", 34, 45000);
				Database b3 = new Database(3,"Arya", 28, 35000);
				Database b4 = new Database(4,"Spencer", 39, 45000);
				Database b5 = new Database(5,"Mark", 42, 50000);
				Database b6 = new Database(6,"Antony",36, 45000);
			
				employeeDetails.add(b1);
				employeeDetails.add(b2);
				employeeDetails.add(b3);
				employeeDetails.add(b4);
				employeeDetails.add(b5);
				employeeDetails.add(b6);
				
								
				for(Database b:employeeDetails)
				{
					System.out.println("The Employee ID is "+b.id);
					System.out.println("The Employee Name is "+b.EmpName);
					System.out.println("Whose age is "+b.EmpAge);
					System.out.println("Whose salary is "+b.EmpSalary);
					System.out.println("------------------------------");
					System.out.println();
					
				}
				int temp = 0;
				temp1 = null;
				for(Database b:employeeDetails)
				{
					
					if(b.EmpSalary>temp)
					{
						temp = b.EmpSalary;
						temp1 = b.EmpName;
					}
				}
				System.out.print("The Employee with the highest salary is "+temp1);
				System.out.print(" ,whose salary is Rs:"+temp);
				System.out.println("-------------------------------------------");
				System.out.println();
				System.out.print(" Sorting Database according to Salary in Descending order.....");
				System.out.println();
				
				Collections.sort(employeeDetails);
				
				for(Database b:employeeDetails)
				{
					System.out.println("The Employee ID is "+b.id);
					System.out.println("The Employee Name is "+b.EmpName);
					System.out.println("Whose age is "+b.EmpAge);
					System.out.println("Whose salary is "+b.EmpSalary);
					System.out.println("------------------------------");
					System.out.println();
					
				}
			
				
			}

		}

	class Database implements Comparable<Database>
	{
		int id, EmpAge, EmpSalary;
		String EmpName;
		public Database(int id, String Name , int age, int salary)
		{
			this.id=id;
			this.EmpName=Name;
			this.EmpAge=age;
			this.EmpSalary=salary;
			
		}
	
		public int compareTo(Database b)
		{
			if(EmpSalary<b.EmpSalary)
			{
				return 1;
			}
			else if(EmpSalary>b.EmpSalary)
				{
					return -1;
				}
			else
			{
				return 0;
			}
		}
		
	}


