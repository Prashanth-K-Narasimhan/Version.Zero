package genericclassex;

import java.util.HashSet;

public class HashSetEx1
{

	public static void main(String[] args) 
	{
		HashSet<Price> mydata = new HashSet<Price>();
		mydata.add(new Price("101", 230));
		mydata.add(new Price("102", 223));
		mydata.add(new Price("103", 213));
		mydata.add(new Price("101", 230));
		mydata.add(new Price("105", 273));
	
		for(Price pobj:mydata)
		{
			System.out.println(pobj);
		}
	}
}	
	class Price
	{
		private String item;
		private int price;
		
		public Price(String item, int price)
		{
			this.item = item;
			this.price = price;
		}
		
		public void setItem(String item)
		{
			this.item = item;
		}
		
		public int getprice()
		{
			return price;
		}
		
		public void setprice(int price)
		{
			this.price = price;
		}
		public String getitem()
		{
			return item;
		}
		public String toString()
		{
			return "item: "+item+"           Price: Rs."+price;
		}
	}



