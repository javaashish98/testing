package interviewpractice.typecast;

public class Test02 {

	public static void main(String[] args) {
		
		String projectName = "Core-Java-Project";
		
		Object obj1 = "Ram";
		m1(obj1);
		
		Object obj2 = 50; //Integer
		m1(obj2);
		
		Double d = 50.9;
		m1(d);
		
		A a = new A();
		m2(a);
		C c = new C();
		m2(c);
		
		String s1 = "10";
		String s2 = "20";
		
		System.out.println(s1+s2);
		
		
		
	}
	
	public static void m1(Object obj) {
		if(obj instanceof String) {
			String s = (String)obj;
			System.out.println(s.toUpperCase());
		}
		else {
			System.out.println(obj);
		}
	}
	
	
	
	public static void m2(A a) {
		System.out.println("M2 method called with A obj");
	}
	
	public static void m2(C c) {
		System.out.println("M2 method called with C Obj");
	}
	
	
}
