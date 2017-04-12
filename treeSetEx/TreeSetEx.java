package treeSetEx;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

public class TreeSetEx {

		public static void main(String[] aa)
		{
			Set <Book> bookDetails = new TreeSet<Book>();
			
			Book b1 = new Book(6,"C++","mani","tonn",5);
			Book b2 = new Book(2,"excel","sam","wemm",5);
			Book b3 = new Book(4,"Java","Wells","Harrison",5);
			Book b4 = new Book(3,"Hadoop","Tony","Stark",5);
			Book b5 = new Book(1,"Spark","Cersei","Lannister",5);
			Book b6 = new Book(5,"OOPs","Warden","Grey",5);
		
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
			 
		}

	}

class Book implements Comparable<Book>
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

	public int compareTo(Book b)
	{
		if(id>b.id)
		{
			return 1;
		}
		else if(id<b.id)
			{
				return -1;
			}
		else
		{
			return 0;
		}
	}
}
