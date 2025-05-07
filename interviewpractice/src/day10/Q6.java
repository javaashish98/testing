package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//What is the method reference Give Example
public class Q6 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ankit");
		list.add("Rahul");
		list.add("Sumit");
		
		
		Function<String, String> fun = new FunImpl();
		
		Function<String, String> fun1 = (String t) -> {
			
			return t.toUpperCase();
		};
		
		
		Function<String, String> fun2 = t -> t.toUpperCase();
		
		
		Function<String, String> fun3 = String::toUpperCase;
		
		list.stream().map(fun1).forEach(System.out::println);
	
		list.stream().map(String::toUpperCase).forEach(System.out::println);

		
		
		
	}
	
}
