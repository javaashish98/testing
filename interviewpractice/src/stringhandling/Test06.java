package stringhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



//StringBuilder object is mutable - changable
//


public class Test06 {

	
	Map<String, Integer> myMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test06 obj = new Test06();
	
		while(true) {
			
			
			
			System.out.println("Enter what do you want to do");
			System.out.println("Enter 1 for save data");
			System.out.println("Enter 2 for get data");
			System.out.println("Enter 3 for show all data");

			Integer userInput = scan.nextInt();
			
			if(userInput == 1) {
				System.out.println("Enter the name");
				String name = scan.next();
				System.out.println("Enter the age");
				Integer age = scan.nextInt();
				
				
				obj.saveEmpData(name, age);
				
				
			} else if(userInput == 2) {
				System.out.println("Enter the name");
				String name = scan.next();
				Integer age = obj.getEmployeeAge(name);
				System.out.println(age);
			} else if(userInput == 3) {
				System.out.println(obj.myMap);
			}
			
		}
		
	}
	
	
	public void saveEmpData(String name, Integer age) {
		myMap.put(name, age);
	}
	
	
	public Integer getEmployeeAge(String name) {
		
		return myMap.get(name);
	
	}
	
	
}
