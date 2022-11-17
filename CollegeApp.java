package AggregationPractice;

public class CollegeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("JohnDoe","4017 Jahun Dough ct","Computer Science",19);
		
		Department Depart1 = new Department("JohnDoe", "Computer Science 1st Year",s1);

		System.out.println(Depart1.student.name);
		System.out.println(Depart1.student.address);
		System.out.println(Depart1.student.dept);
		System.out.println(Depart1.student.age);
		System.out.println(Depart1.name);
		System.out.println(Depart1.chair);
		
		
	}

}
