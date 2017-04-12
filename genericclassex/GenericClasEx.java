package genericclassex;

public class GenericClasEx {

	public static void main(String[] args) 
	{
		dictionary<String, String> data = new dictionary<String, String>("Apple", "Its a type of fruit");
		
		data.printmeaning();
	}


static class dictionary<W,M>
{
	private W word;
	private M meaning;
	
	public dictionary(W word, M meaning)
	{
		this.word = word;
		this.meaning = meaning;
	}
	
	private void printmeaning()
	{
		System.out.println(word);
		System.out.println(meaning);
	}
}
}
