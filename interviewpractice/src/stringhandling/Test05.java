package stringhandling;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test05 {

	//Q what is the difference between string , stringbuider, stringbuilder
	
	//Ans. String is immutable i.e modification will be done on new object
	//     StringBuilder/StringBuffer is mutable i.e modification will be done on same object
	// StringBuilder and StringBuffer both are same only difference is
	// StringBuffer's all method are synchronized while StringBuilder's method are not synchronized
	
	//synchronized means loacking the current method
	// means only one thread can execute that logic 
	
	
	//StringBuffer is threadSafe but StringBuilder is not
	public static void main(String[] args) {
		
		
		String str = "this is my first java programe";
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		
		
		IntStream stream = str.chars();
		
		//can you convert this IntStream to normal Stream?
		Stream<Character> charStream = stream.mapToObj(intChar->(char)intChar).filter(Character::isAlphabetic);
		
		Map<Character, Long> listChar = charStream.collect(Collectors.groupingBy(x->x, Collectors.counting()));
		
		// filter is method of Stream class which are taking Predicate as method argument
		// map is the method of Stream class which are taking Function as method argument
		// forEach is the method of Stream class which are taking Consumer as method argument
		// sorted is the method of Stream class which are taking Comparator as method argument
		
		
		//grouping is the method of Collectors which are taking Function as method argument
		// collect is the method of Stream which are taking Collector as the method argument
		
		
		
		System.out.println(listChar);
		//List<Employee> 
		// Deori List<Employee>
		// Udaipura List<Employee>
		
		Integer compare = "ankit".compareTo("ankit");  // 0 1 -1
		
		System.out.println(compare);
		
		
		Comparator<Integer> comprator = (a,b) -> b.compareTo(a);
		
				
		
		List<Integer> listLint = List.of(12,14,22,11,4,12);
		
		List<Integer> sortedList = listLint.stream().sorted(comprator).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
		
		
		
	}
	
	
}
