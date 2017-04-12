package hashMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx2 {

		public static void main(String[] aa)
		{
			HashMap<Integer, Book> bookDetails = new HashMap<Integer, Book>();
			
			Book b1 = new Book(1,"C++","mani","tonn",5);
			Book b2 = new Book(2,"excel","sam","wemm",5);
			Book b3 = new Book(3,"Java","Wells","Harrison",5);
			Book b4 = new Book(4,"Hadoop","Tony","Stark",5);
			Book b5 = new Book(5,"Spark","Cersei","Lannister",5);
			Book b6 = new Book(6,"OOPs","Warden","Grey",5);
		
			bookDetails.put(5,b1);
			bookDetails.put(6,b2);
			bookDetails.put(3,b3);
			bookDetails.put(4,b4);
			bookDetails.put(2,b5);
			bookDetails.put(1,b6);
			
			for(Map.Entry<Integer,Book> data:bookDetails.entrySet())
			{
				int key = data.getKey();
				Book b = data.getValue();
				
				System.out.println("The Book ID is "+b.id);
				System.out.println("The Book Name is "+b.BookName);
				System.out.println("Author is "+b.BookAuthor);
				System.out.println("Publisher is "+b.BookPublisher);
				System.out.println("Qty is "+b.qty);
				System.out.println("------------------------------");
				
			}
		}

	}

class Book
{
	int id,qty;
	String BookName,BookAuthor,BookPublisher;
	public Book(int id, String Name , String Author, String Publisher, int qty)
	{
		this.id=id;
		this.BookName=Name;
		this.BookAuthor=Author;
		this.BookPublisher=Publisher;
		this.qty=qty;
	}
}
