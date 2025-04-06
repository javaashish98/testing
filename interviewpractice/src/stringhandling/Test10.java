package stringhandling;

//Q. what are the different types of constructors in java
public class Test10 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setSName("Rahul");
		
		Student s2 = new Student(s1);
		
		s2.setSName("Mohan");
		
		
		System.out.println(s2.getSName());
		System.out.println(s1.getSName());

		
		
		
		
		
		
	}
	
}
