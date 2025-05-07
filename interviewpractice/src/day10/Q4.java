package day10;

import java.util.Optional;

//How do you check if an Optional contains a value?
public class Q4 {

	public static void main(String[] args) {
		
		String s = "Ashish";
		Optional<String> op = Optional.of(s);
		
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		
		
	}
	
	
}
