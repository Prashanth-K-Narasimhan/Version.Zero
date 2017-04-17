package javaIOEX;

import java.io.File;

public class FileinfoEx {

	public static void main(String[] args) 
	{
		try
		{
			File fobj = new File("G:\\test.txt");
	
			System.out.println("Check whether File can be Read by Application :");
			System.out.println(fobj.canRead());
		
			System.out.println("Check whether File can be Written by Application :");
			System.out.println(fobj.canWrite());
			
			System.out.println("Check whether File exists :");
			System.out.println(fobj.exists());
			
			System.out.println("Check actual path of File or Directory :");
			System.out.println(fobj.getAbsolutePath());
			
			System.out.println("Check whether File is Hidden :");
			System.out.println(fobj.isHidden());

			System.out.println("The files inside the path are: ");
			System.out.println(fobj.list());		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
		}
	}

}
