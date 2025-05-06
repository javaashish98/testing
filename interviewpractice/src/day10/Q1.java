package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//What is the difference between map() and flatMap() in stream API
//Ans. 


public class Q1 {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ankit");
		list.add("Rahul");
		list.add("Sumit");
		
		
		Stream<String> stream = list.stream(); //Stream method is defined in Collection Interface
		
		//[ankit rahul sumit]
		
		//Stream is a interface defined in jata.util.stream package
		
		List<String> result = stream.map(x-> x.toUpperCase()).collect(Collectors.toList());
		
		//map is the method of stream
		//which is taking Function(I) as Argument
		//and returning Stream(R);
		
		Stream<String> stream1 = list.stream().map(x->x.toUpperCase());
		
		stream1.forEach(x-> System.out.println(x));
		
		
		
		list.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		
		//forEach is the method of stream
		//which is taking Consumer(I) as argument
		//and returning nothing
		
		System.out.println(result);
		
		
		
		
		
		//FlatMap
		
		List<String> list2 = new ArrayList<>();
		list2.add("Suresh");
		list2.add("Subhash");
		list2.add("Mohan");
		
		
		List<List<String>> finalList = new ArrayList<>();
		
		finalList.add(list);
		
		finalList.add(list2);
		
		
		//finlList index 0   listReference
		//finalList index 1  list1Reference
		
		System.out.println(finalList);
		
		//List 0 techDept   List 1 supportDept  List2 maintainance dept
		
		
		List<String> flatMap = finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
		System.out.println(flatMap);
		
		//
		
		
		
	}
	
}
