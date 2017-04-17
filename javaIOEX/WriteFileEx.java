package javaIOEX;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileEx 
{

	public static void main(String[] args) 
	{
		FileWriter fw = null;
		BufferedWriter bw = null;
		try
		{
			String fname = "G:\\myfile.txt";
			fw = new FileWriter(fname);
			
			bw = new BufferedWriter(fw);
			
			bw.write("This is my FirstLine using Java Programming");
			bw.write("This is my 2ndLine using Java Programming");
			bw.write("This is my 3rdLine using Java Programming");
			bw.write("This is my 4thLine using Java Programming");
			bw.write("This is my 5thLine using Java Programming");
			bw.write("This is my 6thLine using Java Programming");
			
			bw.close();
			fw.close();
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		finally
		{
			try
			{
			if(bw != null)
			{
				bw.close();
			}
			else if(fw != null)
			{
				fw.close();
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
