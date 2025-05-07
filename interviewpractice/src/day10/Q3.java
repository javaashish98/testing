package day10;

import java.util.Optional;

//What is optional in java8 and why it is used?
//Ans. In java8 Optional is a container Object used to represent a value
//that may or may not be present

//It's a way to avoid NullPointerException and make our code more readable and safe
public class Q3 {

	// Optionl is a wrapper class indroduced in java 8 under jjava.util package

	public static void main(String[] args) {

		Optional<String> name = Optional.ofNullable("Ankit");
		
		String s = name.orElse("sohan");
		
		System.out.println( "s  : "+s);
		
		if(name.isPresent()) {
			String nameUpperCase = name.get().toUpperCase();
			System.out.println(nameUpperCase);
		} else {
			System.out.println("Name not present");
		}
		
		
		//there are different method present in Optionl class
		
		
		//1. of(T t)
		
		Optional<String> op1 = Optional.of("Ankit"); //Wrapes non-null value // throws if null
		
		
		//2. ofNullabe(T t)
		Optional<String> op2 = Optional.ofNullable(null); //Wrape  value that may be null
		
		//3. isPresent  return true if value is present
		
		if(op2.isPresent()) {
			System.out.println("Op2 value is present "+op2.get() );
		}
		
		//4. ifPresent perform the action if value is present
		op2.ifPresent(x->System.out.println(x));
		
		//5. orElse  Return value of default value if empty
		String op2Res = op2.orElse("Nithin");
		System.out.println(op2Res);
		
		//6 orElseThrow
		String optV = op2.orElseThrow( ()-> new RuntimeException("Value not present") );
		System.out.println(optV);
		
		//7 map   Transform the value if present
		
		String upperCase = op2.map(String::toUpperCase).get();		
		System.out.println();
		

	}

}
