package javaCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

		public static void main(String[] aa)
		{
			ArrayList<Book> bookDetails = new ArrayList<Book>();
			
			Book b1 = new Book(1,"C++","mani","tonn",5);
			Book b2 = new Book(2,"excel","sam","wemm",5);
			Book b3 = new Book(3,"Java","Wells","Harrison",5);
			Book b4 = new Book(4,"Hadoop","Tony","Stark",5);
			Book b5 = new Book(5,"Spark","Cersei","Lannister",5);
			Book b6 = new Book(6,"OOPs","Warden","Grey",5);
		
			bookDetails.add(b1);
			bookDetails.add(b2);
			bookDetails.add(b3);
			bookDetails.add(b4);
			bookDetails.add(b5);
			bookDetails.add(b6);
			
			for(Book b:bookDetails)
			{
				System.out.println("The Book ID is "+b.id);
				System.out.println("The Book Name is "+b.BookName);
				System.out.println("Author is "+b.BookAuthor);
				System.out.println("Publisher is "+b.BookPublisher);
				System.out.println("Qty is "+b.qty);
				System.out.println("------------------------------");
				
			}
			
			bookDetails.remove(b6);
			Iterator itr = bookDetails.iterator();
			while(itr.hasNext())
			{
				System.out.println("the book is at.."+itr.next());
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
