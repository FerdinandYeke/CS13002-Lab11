package AggregationLab;

public class AuthorI extends Publisher {

	String name;
	String address;
	int age;
	
	
	public AuthorI(String name, String address, int age, String PublisherID)
	{
		this.name = name;
		this.address = address;
		this.age = age;
		this.PublisherID = PublisherID;
	}
	
}
