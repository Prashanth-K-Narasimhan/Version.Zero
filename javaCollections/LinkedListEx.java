package javaCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) 
	{
		LinkedList<String> Data = new LinkedList<String>();
		
			
		Data.add("a");
		Data.add("b");
		Data.add("c");
		Data.add("d");
		Data.add("e");
		Data.add("f");
		Data.addFirst("1");
		Data.addLast("10");
		
		ListIterator<String> itr = Data.listIterator();
			System.out.println("Inserting Order... ");
			
		while(itr.hasNext())
		{
			System.out.println("the Data is at.."+itr.next());
		}
		
		System.out.println();
		System.out.println("Reverse Order... ");
		
		while(itr.hasPrevious())
		{
			System.out.println("the Data is at.."+itr.previous());
		} 
	
		Data.removeFirst();
		Data.removeLast();
		
		ListIterator<String> itr1 = Data.listIterator();
		System.out.println("Inserting Order... after removing first and last element ");
		
	while(itr1.hasNext())
	{
		System.out.println("the Data is at.."+itr1.next());
	}
	
	Data.set(0,"TesT");
	System.out.println(Data);
	}

}
