package genericclassex;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) 
	{
		HashSet<String> hobj = new HashSet<String>();
		hobj.add("Sunday");
		hobj.add("Monday");
		hobj.add("Tuesday");
		hobj.add("Wednesday");
		hobj.add("Thursday");
		hobj.add("Friday");
		hobj.add("Saturday");
		
		System.out.println("Data Display" + hobj);
		System.out.println("Size of the data is " + hobj.size());
		
		hobj.remove("Sunday");
		
		System.out.println("Data Display after remove" + hobj);
		System.out.println("Size of the data after remove is " + hobj.size());
	}

}
