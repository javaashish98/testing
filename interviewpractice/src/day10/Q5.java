package day10;

import java.util.Optional;

//What is the difference between Optional.of() and Optional.ofNullable() and Optional.empty()
public class Q5 {

	
	public static void main(String[] args) {
		
		//Optional.of(null);
		Optional.ofNullable(null);
		Optional.ofNullable("Ankit");
		
		Optional<Integer> o = Optional.empty();
		
		if(o.isEmpty()) {
			System.out.println("You are right vaalue is empty");
		}
		
		
	}
	
}
