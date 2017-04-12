package javaCollections;

import java.util.LinkedList;
import java.util.List;

public class CheckListDataEx 
{
	public static void main(String[] args)
	{
		LinkedList<String> mydata = new LinkedList<String>();
		mydata.add("First");
		mydata.add("Second");
		mydata.add("Third");
		mydata.add("Fourth");
		
		List<String> listdata = new LinkedList<String>();
		listdata.add("Second");
		listdata.add("Fourth");
		System.out.println("Does LinkedList contain all the List Elements? "+mydata.containsAll(listdata));
		
		listdata.add("Fifth");
		System.out.println("Does LinkedList contain all the List Elements? "+mydata.containsAll(listdata));
		
	}
}
