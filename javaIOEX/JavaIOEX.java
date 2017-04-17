package javaIOEX;

import java.io.FileInputStream;
import java.io.IOException;

public class JavaIOEX {

	private static FileInputStream f;

	public static void main(String[] args) 
	{
		int i;
		char c;
		try
		{
			f = new FileInputStream ("G:\\test.txt");
			
			while((i=f.read()) != -1)
			{
				c= (char) i;
				System.out.println(c);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
