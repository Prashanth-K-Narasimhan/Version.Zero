package javaIOEX;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryDataEx {

	public static void main(String[] args) 
	{
		String datafile = "G:\\test2.txt";
		
		String bytedata = "This is the example of Binary Data File ";
		byte[] buffer = bytedata.getBytes();
		
		FileOutputStream fous = null;
		
		try
		{
			fous = new FileOutputStream (datafile);
			fous.write(buffer);
			
			fous.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Completed Writing Data to file from Finally");
		}
	}

}
