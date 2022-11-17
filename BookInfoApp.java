package AggregationLab;

public class BookInfoApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AuthorI author1 = new AuthorI("Harry Pot","4616 Wizard way street",19,"HARR8347");
		BookI book1 = new BookI("Harry Potter",15);
		
		
		System.out.println("Author Name: "+author1.name);
		System.out.println("Author address: "+author1.address);
		System.out.println("Author age: "+author1.age);
		System.out.println("Author's Book name: "+book1.name);
		System.out.println("Book Price: "+book1.price);
		System.out.println("Publisher Name: "+author1.PublisherID);
		
		
	}

}
