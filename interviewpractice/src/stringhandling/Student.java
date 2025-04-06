package stringhandling;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

	
	//here we can see one default constructor which is added
	// by compiler
	
	//Note: it is only added when no other constructor is defined
	
	private String sName;
	
	//Parameterized constructor
	// if we add any constructor then default constructor
	//will not be present
	public Student(String sName) {
		
	}
	
	//No-Arg Constructor
	public Student() {
		
	}
	
	public Student(Student student) {
		
		
		this.sName = student.sName;
	}
	
	
}
