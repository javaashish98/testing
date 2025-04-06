package stringhandling;

public class Test03 {

	
	public static void main(String[] args) {
		
		
		String s1 = "hello";
		
		System.out.println(s1.hashCode());
		
		s1 = s1+ " World";
		
		System.out.println(s1.hashCode());
		
		
		s1 = s1 + " welcome";
		s1 = s1 + " to the java world";
		
		
		String str2 = "hello";
		
		System.out.println(str2.hashCode());
		
		
		System.out.println();
		
		
		
		
	}
}
