package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//How do you convert a list of strings to uppercase using stream

public class Q2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ankit");
		list.add("Rahul");
		list.add("Sumit");
		
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		//System.out.println(upperCase);
	}

}
