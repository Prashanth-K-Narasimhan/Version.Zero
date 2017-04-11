package javaCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class javaCollectionsEx {

	public static void main(String[] args)
	{
		ArrayList<String> EmpName = new ArrayList<String>();
		
		EmpName.add("good");
		EmpName.add("good1");
		EmpName.add("good2");
		EmpName.add("good3");
		EmpName.add("good4");
		EmpName.add("good5");
		System.out.println(EmpName);
		
		Iterator<String> itr = EmpName.iterator();
		while(itr.hasNext())
		{
			System.out.println("good is"+itr.next());
		}
		
		for(String O1:EmpName)
		{
			System.out.println("Name"+O1);
		}
	}

}
