package stringhandling;

public class Test08 {

	
	public static void main(String[] args) {
		
	Employee emp1 = new Employee(10, "Rahul", 35);
	Employee emp2 = emp1;
		
	emp2.updateNameNormally("Prakash");
	
	
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		String s1 = "Ram";
		String s2 = "Ram";
		
		s2.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	
}
