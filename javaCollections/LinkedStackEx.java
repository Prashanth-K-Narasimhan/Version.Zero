package javaCollections;

import java.util.LinkedList;

public class LinkedStackEx {

	public static void main(String[] args) 
	{
		LinkedList<String> myData = new LinkedList<String>();
		myData.add("First");
		myData.add("Second");
		myData.add("Third");
		myData.add("Fourth");
		myData.add("Fifth");
		
		System.out.println("Elements in LinkedList before Push ");
		System.out.println(myData);
		myData.push("Test");
		
		System.out.println("Elements in LinkedList after Push ");
		System.out.println(myData);
		myData.pop();
		
		System.out.println("Elements in LinkedList after Pop ");
		System.out.println(myData);
		
	}

}
