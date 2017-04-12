package hashMapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{

	public static void main(String[] args) 
	{
		HashMap<Integer , String> employeedata = new HashMap<Integer,String>();
		
		employeedata.put(101, "TIm");
		employeedata.put(102, "KIm");
		employeedata.put(103, "SIm");
		employeedata.put(104, "PIm");
		employeedata.put(105, "LIm");
		employeedata.put(106, "EIm");
		employeedata.put(107, "WIm");
	
		for (Map.Entry id:employeedata.entrySet())
		{
			System.out.println(id.getKey()+" ------ "+id.getValue());
		}
	}

}
