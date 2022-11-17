package AggregationLab;

public class WatchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tissot Watch1 = new Tissot();
		Seiko Watch2 = new Seiko();
		Carson Watch3 = new Carson();
		Quartz Watch4 = new Quartz();
		
		System.out.println("Tissot");
		Watch1.display();
		Watch1.Property();
		System.out.println("");
		System.out.println("Seiko");
		Watch2.display();
		Watch2.design();
		Watch2.Property();
		System.out.println("");
		System.out.println("Carson");
		Watch3.display();
		Watch3.Type();
		System.out.println("");
		System.out.println("Quartz");
		Watch4.display();
		Watch4.Type();
		
	}

}
