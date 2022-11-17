package AggregationLab;

public class BookI extends Publisher{
	
	String name;
	int price;
	
	Publisher publisher;
	
	public BookI(String name, int price)
	{
		this.name = name;
		this.price = price;
	}

}
