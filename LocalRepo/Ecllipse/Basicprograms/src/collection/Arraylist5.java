package collection;
import java.util.ArrayList;
import java.util.List;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class Arraylist5 {
	public static void main(String[] args) {
		List<Book>list=new ArrayList<Book>(); 
		Book b1= new Book(101,"let us see","yashwant kanetkar","BPB",8);
		Book b2=new Book(102,"data communication and networking","fourzan","Mc graw Hill",4);
		Book b3=new Book(103,"operating system","galvin","willey",6);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104,"let us cod it","xyz","pqr",5));
		System.out.println("list of book class element:"+list);
		System.out.println(list.get(0).name);
		System.out.println(list.get(1).author );
		for(Book b:list);
		System.out.println(list);
		System.out.println("****");

	}

}
