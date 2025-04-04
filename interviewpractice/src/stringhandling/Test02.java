package stringhandling;

public class Test02 {

	
	public static void main(String[] args) {
		

		
		
		
		String str1 = "ankit"; //92964745
		
		System.out.println(str1.hashCode());
		
		str1 = str1.toUpperCase();
		
		//ANKIT 62426985
		
		System.out.println(str1.hashCode());
		
		
		String str2 = "ankit";
		
		str2 = str2+" Sahu";
		
		System.out.println(str2);
		
		System.out.println(str2.hashCode());
		
		
		
	}
	
}
