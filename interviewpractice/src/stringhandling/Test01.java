package stringhandling;

public class Test01 {

	public static void main(String[] args) {
		
		//q1. count number of character in string without using any built in function
		String str = "Ashish Sahu";
		
		
		char[] charArray = str.toCharArray();
		
		//q2 count number of words in a given string
		int spaceCount = 1;
		
		for(Character ch : charArray) {
			if(Character.isSpaceChar(ch)) {
				spaceCount++;
			}
			
		}
		System.out.println(str.isBlank() ? 0 :  spaceCount);
	}
	
}
