package stringhandling;

public class Test07 {

	
	public static void main(String[] args) {
		
		String s1 = new String("Ashish");
		
		String s2 = new String("Ashish");
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		// new always create new memory no matter which class object you are creating
		StringBuilder sb1 = new StringBuilder("Ram");
		StringBuilder sb2 = new StringBuilder("Ram");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		//String builder is not following any SCAP
		
		
		//1207415468
		String password = "abc@123"; // this object is created once it will not modify
		
		System.out.println(password.hashCode());
		
		password = "bca@991"; //293121775
		
		System.out.println(password.hashCode());
		
		String abc = "abc@123";
		
		abc = abc.toUpperCase(); //488447692
		
		System.out.println(abc.hashCode());

		
		
		
		
		
	}
}
